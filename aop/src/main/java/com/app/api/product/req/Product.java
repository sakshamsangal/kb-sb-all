package com.app.api.product.req;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private int productId;
    private String name;
    private int qty;
    private double price;
}
