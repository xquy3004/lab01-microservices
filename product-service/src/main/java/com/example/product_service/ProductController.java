package com.example.product_service;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api/products")
public class ProductController {
@GetMapping
public List<Map<String, Object>> getProducts() {
    return List.of(
        Map.of("id", 1, "name", "Mouse", "price", 150000),
        Map.of("id", 2, "name", "Keyboard", "price", 250000)
    );
}
@GetMapping("/{id}")
public Map<String, Object> getProduct(@PathVariable int id) {
    return Map.of(
        "id", id,
        "name", "Mouse",
        "price", 150000
    );
}
}