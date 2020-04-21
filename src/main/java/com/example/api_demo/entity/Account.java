package com.example.api_demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Table(name = "ACCOUNT")
@Entity
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private String userId;

    private String title;

    private int id;

    private String body;
}
