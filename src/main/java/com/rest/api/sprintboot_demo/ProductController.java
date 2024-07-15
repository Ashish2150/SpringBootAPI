package com.rest.api.sprintboot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.sprintboot_demo.entities.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
 
    @GetMapping("/") 
    public Product test(){
        Product product = new Product();
        product.setId(1);
        product.setName("Apple");
        product.setAmount(32.0);
        product.setDescription("This is a fruit");

        return product;
    }

}
