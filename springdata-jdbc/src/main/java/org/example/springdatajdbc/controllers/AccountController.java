package org.example.springdatajdbc.controllers;

import org.example.springdatajdbc.dto.TransferRequest;
import org.example.springdatajdbc.services.TransferService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request) {
        transferService.transferMoney(
            request.getSenderAccountId(),
            request.getReceiverAccountId(),
            request.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<?> getAllAccounts(@RequestParam(required = false) String name) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountsByName(name);
        }
    }
}

