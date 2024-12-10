package com.sample.microservices.product.controller;

import com.sample.microservices.product.dto.ProductRequest;
import com.sample.microservices.product.dto.ProductResponse;
import com.sample.microservices.product.model.Product;
import com.sample.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        // Create a new product
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        // Get all products
        return productService.getAllProducts();
    }
}
