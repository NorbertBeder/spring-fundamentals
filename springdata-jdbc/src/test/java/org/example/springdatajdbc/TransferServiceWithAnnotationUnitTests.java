package org.example.springdatajdbc;

import org.example.springdatajdbc.exceptions.AccountNotFoundException;
import org.example.springdatajdbc.models.Account;
import org.example.springdatajdbc.repositories.AccountRepository;
import org.example.springdatajdbc.services.TransferService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class TransferServiceWithAnnotationUnitTests {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private TransferService transferService;

    @Test
    public void moneyTransferHappyFlow(){
        Account sender = new Account();
        sender.setId(1L);
        sender.setAmount(new BigDecimal(1000));

        Account destination = new Account();
        destination.setId(2L);
        destination.setAmount(new BigDecimal(1000));

        given(accountRepository.findById(sender.getId()))
                .willReturn(Optional.of(sender));

        given(accountRepository.findById(destination.getId()))
                .willReturn(Optional.of(destination));

        transferService.transferMoney(1, 2, new BigDecimal(100));

        verify(accountRepository)
                .changeAmount(1L, new BigDecimal(900));

        verify(accountRepository)
                .changeAmount(2L, new BigDecimal(1100));
    }

    @Test
    public void moneyTransferDestinationAccountNotFound(){
        Account sender = new Account();
        sender.setId(1L);
        sender.setAmount(new BigDecimal(1000));

        given(accountRepository.findById(sender.getId()))
                .willReturn(Optional.of(sender));

        given(accountRepository.findById(2L))
                .willReturn(Optional.empty());

        assertThrows(AccountNotFoundException.class,
                () -> transferService.transferMoney(1, 2, new BigDecimal(100)));

        verify(accountRepository, never()).changeAmount(anyLong(), any());
    }
}
