package com.example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankTransferService {

    private final BankTransferRepository repository;

    public BankTransferService(BankTransferRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public String completeTransfer(BankTransfer bankTransfer) {
        return repository.save(bankTransfer.complete()).getId();
    }

    @Transactional(readOnly = true)
    public BankTransfer findById(String id) {
        return repository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<BankTransfer> findAll() {
        return repository.findAll();
    }
}
