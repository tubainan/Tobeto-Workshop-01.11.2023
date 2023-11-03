package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

@RequestMapping("api/productcontrol")
@RestController
public class ProductController {
    @GetMapping   // api/Productcontrol
    public String get(){
        return "Product get edilerek getirildi." ;
    }

    @PostMapping
    public String post(){
        return  "Product post edilerek eklendi.";
    }
    @PutMapping
    public String put(){
        return "Product put edilerek güncellendi";
    }
    @DeleteMapping
    public String delete(){
        return "Product delete edildi";
    }
}
