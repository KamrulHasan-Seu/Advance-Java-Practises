package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ControllerClass {

    ProductRepository productRepository;

    public ControllerClass(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(value = "/products")
    @ResponseBody
    public Iterable<Product> getAllProducts() {

        Product p = new Product(3, "Box", 400);
//        productRepository.save(p);
        Product p1 = new Product(2, "Bag", 700);
//        productRepository.save(p1);


        return productRepository.findAll();
    }

    @GetMapping(value = "/product")
    @ResponseBody
    public Product getProduct(@RequestParam int id) {
        return productRepository.findById(id).orElse(new Product());
    }

    @GetMapping(value = "/productbyname")
    @ResponseBody
    public List<Product> getAllSameNameProducts(@RequestParam String name) {
        return productRepository.findProductByProductName(name);
    }

    @PostMapping(value = "/insertproduct")
    @ResponseBody
    public Product insertProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
