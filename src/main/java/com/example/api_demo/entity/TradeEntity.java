package com.example.api_demo.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
public class TradeEntity {

    @Column(name = "tradeId", nullable = false)
    private String tradeId;

    @Column(name = "tradeVersion", nullable = true)
    private int tradeVersion;

    @Column(name = "account", nullable = true)
    private Account account;

    @Column(name = "tradeDate", nullable = true)
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date tradeDate;

}
