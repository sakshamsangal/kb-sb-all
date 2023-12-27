package com.app.product;

import com.app.product.req.Product;
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

    @GetMapping("/allProd")
    public List<Product> getAllProducts() {
        return service.getAllProducts();

    }

}
