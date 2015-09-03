package com.springapp.mvc.domain.repository;

import com.springapp.mvc.domain.implementation.Product;

import java.util.List;

/**
 * Created by waglem1 on 9/3/2015.
 */
public interface ProductRepository {
    List<Product> getAllProducts();
}
