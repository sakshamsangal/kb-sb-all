package com.app.product.service;

import com.app.fis.service.GetBooksApiService;
import com.app.fis.service.PostFileApiService;
import com.app.product.ProductExtField;
import com.app.product.req.Product;
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

    private final ProductExtField extProperty;
    private final PostFileApiService postFileApiService;
    private final GetBooksApiService getBooksApiService;
    List<Product> productList = null;

    @PostConstruct
    public void loadProductsFromDB() {
        log.info("OEI loadProductsFromDB");
        productList = IntStream.rangeClosed(1, extProperty.getRow())
                .mapToObj(i -> Product.builder()
                        .productId(i)
                        .name("product " + i)
                        .qty(new Random().nextInt(10))
                        .price(new Random().nextInt(5000)).build()
                ).collect(Collectors.toList());
    }


    public List<Product> getProducts() {
        String s = postFileApiService.postFileApi();
        System.out.println("s = " + s);
        String booksApi = getBooksApiService.getBooksApi();
        System.out.println("booksApi = " + booksApi);
        return productList;
    }

    public Product getProduct(int id) {
        return productList.stream()
                .filter(product -> product.getProductId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("product " + id + " not found"));
    }


}
