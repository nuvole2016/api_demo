package com.example.api_demo.repository;

import com.example.api_demo.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TradeRepository extends JpaRepository<Trade, String> {

    @Query("select t from Trade t where t.tradeId = ?1")
    Trade findByTradeId(String tradeId);
}
