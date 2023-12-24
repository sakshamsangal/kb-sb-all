package com.app.model.product.service;

import com.app.config.ConfigProperty;
import com.app.consume.emp.EmployeeClient;
import com.app.model.product.req.Product;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ConfigProperty configProperty;
    private final EmployeeClient employeeClient;
    List<Product> productList = null;


    @PostConstruct
    public void loadProductsFromDB() {
        log.info("OEI loadProductsFromDB");
        productList = IntStream.rangeClosed(1, configProperty.getProdRows())
                .mapToObj(i -> Product.builder()
                        .productId(i)
                        .name("product " + i)
                        .qty(new Random().nextInt(10))
                        .price(new Random().nextInt(5000)).build()
                ).collect(Collectors.toList());
    }


    public List<Product> getProducts() {
        return productList;
    }

    public Product getProduct(int id) {
        Product product1 = productList.stream()
                .filter(product -> product.getProductId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("product " + id + " not found"));
        product1.setName(product1.getName() + employeeClient.welcome());
        return product1;
    }


}
