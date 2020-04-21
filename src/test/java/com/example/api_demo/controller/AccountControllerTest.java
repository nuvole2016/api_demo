package com.example.api_demo.controller;

import com.example.api_demo.ApiDemoApplication;
import com.example.api_demo.entity.Account;
import com.example.api_demo.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiDemoApplication.class)
class AccountControllerTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    void getTradeById() {
        Account account=accountRepository.findByUserId("e1289");
        assertEquals("e",account.getTitle());
    }

}