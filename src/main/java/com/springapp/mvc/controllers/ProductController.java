package com.springapp.mvc.controllers;

import com.springapp.mvc.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by waglem1 on 9/2/2015.
 */

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/products")
    public String list(Model model) {

//        Product iphone = new Product("P1234", " iPhone 5s", 500);
//        iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
//        iphone.setCategory("Smart Phone");
//        iphone.setManufacturer("Apple");
//        iphone.setUnitsInStock(1000);
//        model.addAttribute("product", iphone);

//        model.addAttribute("product", new Product("P1234", " iPhone 5s", 500));
        model.addAttribute("products", productRepository.getAllProducts());

        return "products";
    }
}



