package com.example.homework8service.entity;

import lombok.Data;

import java.util.List;

@Data
public class Order {

    private Long id;

    private long timestamp;

    private List<Long> postIds;
}
