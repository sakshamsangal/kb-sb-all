package com.app.model.product;

import com.app.model.product.req.Product;
import com.app.model.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class ProductApi {

    private final ProductService service;

    @GetMapping("/all")
    public List<Product> welcome() {
        return service.getProducts();
    }


    @GetMapping("/single/{id}")
    public Product welcome1(@PathVariable int id) {
        return service.getProduct(id);
    }
}
