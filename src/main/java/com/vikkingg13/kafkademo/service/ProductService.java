package com.vikkingg13.kafkademo.service;

import com.vikkingg13.kafkademo.service.dto.CreateProductDto;

import java.util.concurrent.ExecutionException;

public interface ProductService {

    String createProduct(CreateProductDto createProductDto) throws ExecutionException, InterruptedException;
}
