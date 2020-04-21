package com.example.api_demo.impl;

import com.example.api_demo.entity.Trade;
import com.example.api_demo.repository.TradeRepository;
import com.example.api_demo.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    @Override
    public List getAllTrade() {
        return tradeRepository.findAll();
    }


    @Override
    public Trade findTradeById(String tradeId) {

        return tradeRepository.findByTradeId(tradeId);
    }
}
