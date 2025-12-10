package org.example.springdatajdbc;

import org.example.springdatajdbc.models.Account;
import org.example.springdatajdbc.repositories.AccountRepository;
import org.example.springdatajdbc.services.TransferService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TransferServiceUnitTests {

    @Test
    @DisplayName("Test the amount is transferred from one account to another if no exceptions are thrown")
    public void moneyTransferHappyFlow(){
        AccountRepository accountRepository = mock(AccountRepository.class);

        TransferService transferService = new TransferService(accountRepository);

        Account sender = new Account();
        sender.setId(1L);
        sender.setAmount(new BigDecimal(1000));

        Account receiver = new Account();
        receiver.setId(2L);
        receiver.setAmount(new BigDecimal(1000));

        given(accountRepository.findById(1L)).willReturn(Optional.of(sender));
        given(accountRepository.findById(2L)).willReturn(Optional.of(receiver));

        transferService.transferMoney(sender.getId(), receiver.getId(), new BigDecimal(100));

        verify(accountRepository).changeAmount(1L, new BigDecimal(900));
        verify(accountRepository).changeAmount(2L, new BigDecimal(1100));
    }
}
