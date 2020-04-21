package com.example.api_demo.service;

import com.example.api_demo.entity.Trade;

import java.util.List;

public interface TradeService {

    List getAllTrade();

    Trade findTradeById(String tradeId);
}
