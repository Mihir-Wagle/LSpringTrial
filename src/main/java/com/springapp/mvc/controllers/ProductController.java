package com.springapp.mvc.controllers;

import domain.implementation.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by waglem1 on 9/2/2015.
 */

@Controller
public class ProductController {
    @RequestMapping("/products")
    public String list(Model model) {
        Product iphone = new Product("P1234", " iPhone 5s", 500);
        iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
        iphone.setCategory("Smart Phone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);
        model.addAttribute("product", iphone);
        return "products";
    }
}


