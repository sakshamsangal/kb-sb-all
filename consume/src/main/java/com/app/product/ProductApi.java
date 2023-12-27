package com.app.product;

import com.app.product.req.Product;
import com.app.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class ProductApi {

    private final ProductService service;

    @GetMapping("/products")
    public List<Product> welcome() {
        return service.getProducts();
    }

}
