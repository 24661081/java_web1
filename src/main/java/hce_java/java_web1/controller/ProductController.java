package hce_java.java_web1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {

    @GetMapping ("/products")
    public String listProducts() {
        return "Xin chao cac ban HCE";
    }

    
}



  
