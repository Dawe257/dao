//package com.dzhenetl.dao.controller;
//
//import com.dzhenetl.dao.repository.ProductRepository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController("/products")
//public class ProductController {
//
//    ProductRepository repository;
//
//    public ProductController(ProductRepository repository) {
//        this.repository = repository;
//    }
//
//    @GetMapping("/fetch-product")
//    public String getProduct(@RequestParam(name = "name") String name) {
//        return repository.getProductName(name);
//    }
//}
