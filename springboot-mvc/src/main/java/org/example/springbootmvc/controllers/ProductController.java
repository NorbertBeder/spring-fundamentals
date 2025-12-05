package org.example.springbootmvc.controllers;

import org.example.springbootmvc.models.Product;
import org.example.springbootmvc.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.getProducts();
        model.addAttribute("products", products);
        return "products.html";
    }

//    @PostMapping( "/products")
//    public String addProduct(@RequestParam String name,
//                             @RequestParam double price,
//                             Model model) {
//        Product product = new Product();
//        product.setName(name);
//        product.setPrice(price);
//        productService.addProduct(product);
//
//        var products = productService.getProducts();
//        model.addAttribute("products", products);
//
//        return "products.html";
//    }

    @PostMapping("/products")
    public String addProduct(Product product,
                             Model model) {

        productService.addProduct(product);

        var products = productService.getProducts();
        model.addAttribute("products", products);

        return "products.html";
    }
}
