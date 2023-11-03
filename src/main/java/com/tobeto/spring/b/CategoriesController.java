package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categories")
public class CategoriesController {
    @GetMapping   // api/categories
    public String get(){
        return "Kategoriler getirildi." ;
    }

    @PostMapping
    public String post(){
        return  "Kategoriler eklendi.";
    }
    @PutMapping
    public String put(){
        return "Kategoriler güncellendi";
    }
    @DeleteMapping
    public String delete(){
        return "Kategoriler silindi";
    }
}
