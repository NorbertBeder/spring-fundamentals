package org.example.springrest.services;

import org.example.springrest.exceptions.NotEnoughMoneyException;
import org.example.springrest.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
