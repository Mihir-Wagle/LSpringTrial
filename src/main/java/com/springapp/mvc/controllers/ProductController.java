package com.springapp.mvc.controllers;

import com.springapp.mvc.domain.implementation.DatabaseRepository;
import com.springapp.mvc.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by waglem1 on 9/2/2015.
 */

@Controller
public class ProductController {
    @Qualifier("inMemoryProductRepository")
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private DatabaseRepository databaseRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/productsDb")
    public String list(Model model) {

//        Product iphone = new Product("P1234", " iPhone 5s", 500);
//        iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
//        iphone.setCategory("Smart Phone");
//        iphone.setManufacturer("Apple");
//        iphone.setUnitsInStock(1000);
//        model.addAttribute("product", iphone);

//        model.addAttribute("product", new Product("P1234", " iPhone 5s", 500));

//        String sql = "insert into Product values (?, ?)";
//        jdbcTemplate.update(sql, new Object[]{53, "MData"});
//        jdbcTemplate.update("insert into Product values (53, 'BobQuestion')");
        jdbcTemplate.update("insert into product values (253, 'Query')");

//        model.addAttribute("products", productRepository.getAllProducts());
//
        model.addAttribute("products", databaseRepository.getAllProducts());

        return "products";
    }

    @RequestMapping("/productsInMemory")
    public String listInMemory(Model model) {
        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }

}



