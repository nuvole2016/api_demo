package com.example.api_demo.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "TRADE")
@Entity
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tradeTableId;

    private String tradeId;

    private int tradeVersion;

    private Long accountId;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date tradeDate;

}
