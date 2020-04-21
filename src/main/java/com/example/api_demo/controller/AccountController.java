package com.example.api_demo.controller;

import com.example.api_demo.entity.Account;
import com.example.api_demo.entity.Trade;
import com.example.api_demo.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

@ResponseBody
@RestController
@Api
@Component
public class AccountController {

    @Value("${webServer.url}")
    private String webUrl;

    @Autowired
    private AccountService accountService;

    @ApiOperation(value = "get all account")
    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public List<Trade> getAllAccount() {

        return accountService.getAllAccount();

    }

    @ApiOperation(value = "get account by userId")
    @RequestMapping(value = "/account/{userId}", method = RequestMethod.GET)
    public Account getAccountById(@PathVariable String userId) {

        return accountService.findAccountByUserId(userId);

    }

    @ApiOperation(value = "get account by userId")
    @RequestMapping(value = "/account2/{id}", method = RequestMethod.GET)
    public Account getAccountByIdFromWeb(@PathVariable String id) {

        Account account = new Account();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Account> responseEntity = restTemplate.getForEntity(webUrl + id, Account.class);

        HttpHeaders headers = responseEntity.getHeaders();
        HttpStatus statusCode = responseEntity.getStatusCode();
        int code = statusCode.value();

        account = responseEntity.getBody();

        return account;

    }

}
