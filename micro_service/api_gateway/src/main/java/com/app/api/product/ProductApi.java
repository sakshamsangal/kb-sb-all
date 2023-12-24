package com.app.api.product;

import com.app.api.product.req.Product;
import com.app.api.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class ProductApi {

    private final ProductService service;

    @GetMapping("/wel")
    public List<Product> welcome() {


        return service.getProducts();

    }

}
