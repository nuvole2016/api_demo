package com.example.api_demo.service;

import com.example.api_demo.entity.Account;

import java.util.List;

public interface AccountService {

    List getAllAccount();

    Account findAccountByUserId(String userId);
}
