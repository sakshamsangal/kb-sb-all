package com.app.model.product;

import com.app.model.product.req.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
@Slf4j
public class ProductApi {

    private final ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        log.info("ProductApi getAllProducts start");
        return service.getAllProducts();
    }

}
