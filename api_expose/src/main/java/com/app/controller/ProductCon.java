package com.app.controller;

import com.app.service.ProductService;
import com.app.model.Product;
import com.app.util.AppConstant;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
@Slf4j
public class ProductCon {

    private final ProductService productService;

    /**
     * See <a href="http://localhost:8080/v1/products">http://localhost:8080/v1/products</a>
     */
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        log.info("{} getAllProducts start", AppConstant.PROJECT_NAME);
        return ResponseEntity.ok(productService.getAllProducts());
    }



}
