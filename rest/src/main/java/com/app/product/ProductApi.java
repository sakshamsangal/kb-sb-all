package com.app.product;

import com.app.product.req.Product;
import com.app.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProductApi {

    @Autowired
    private ProductService service;

    @GetMapping("/wel")
    public List<Product> welcome() {


        return service.getProducts();

    }

}
