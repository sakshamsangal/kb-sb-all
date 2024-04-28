package com.app.model;

import lombok.*;


@Getter
@Setter
@Builder
public class Product {
    private int productId;
    private String name;
    private int qty;
    private double price;
}
