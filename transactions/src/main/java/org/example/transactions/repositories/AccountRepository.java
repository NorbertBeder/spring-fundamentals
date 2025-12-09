package org.example.transactions.repositories;

import org.example.transactions.models.Account;
import org.example.transactions.models.mappers.AccountRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class AccountRepository {

    private final JdbcTemplate jdbcTemplate;

    public AccountRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Account findByAccountId(long accountId) {
        String sql = "SELECT * FROM account WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new AccountRowMapper(), accountId);
    }

    public void changeAmount(long accountId, BigDecimal amount) {
        String sql = "UPDATE account SET amount = ? WHERE id = ?";
        jdbcTemplate.update(sql, amount, accountId);
    }

    public List<Account> findAll() {
        String sql = "SELECT * FROM account";
        return  jdbcTemplate.query(sql, new AccountRowMapper());
    }
}
