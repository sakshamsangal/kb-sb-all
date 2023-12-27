package com.app.product;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ProductExtField {

    @Value("${product.row}")
    public int row;
}
