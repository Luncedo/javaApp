package com.example.thymeleafspringecommerce.service;

import com.example.thymeleafspringecommerce.models.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Integer id);

    List<Product> listProducts();
}
