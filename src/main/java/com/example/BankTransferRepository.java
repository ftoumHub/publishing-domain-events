package com.example;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface BankTransferRepository extends Repository<BankTransfer, String> {

    BankTransfer save(BankTransfer bankTransfer);

    BankTransfer findById(String id);

    List<BankTransfer> findAll();
}
