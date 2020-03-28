package com.example;

import lombok.*;

@Value
public class BankTransferCompletedEvent {

    private final String bankTransferId;

}
