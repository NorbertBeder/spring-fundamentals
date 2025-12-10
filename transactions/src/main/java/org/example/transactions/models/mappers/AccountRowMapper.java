package org.example.transactions.models.mappers;

import org.example.transactions.models.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setName(rs.getString("name"));
        account.setId(rs.getLong("id"));
        account.setAmount(rs.getBigDecimal("amount"));
        return account;
    }
}
