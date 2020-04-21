package com.example.api_demo.impl;

import com.example.api_demo.entity.Account;
import com.example.api_demo.repository.AccountRepository;
import com.example.api_demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public Account findAccountByUserId(String userId) {
        return accountRepository.findByUserId(userId);
    }


}
