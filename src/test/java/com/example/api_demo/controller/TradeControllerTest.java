package com.example.api_demo.controller;

import com.example.api_demo.ApiDemoApplication;
import com.example.api_demo.entity.Trade;
import com.example.api_demo.repository.TradeRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiDemoApplication.class)
class TradeControllerTest {

    @Autowired
    private TradeRepository tradeRepository;

    @Test
    public void test(){
        List<Trade> tradeList=tradeRepository.findAll();
        int size=tradeList.size();
        assertEquals(6,size);
    }

}