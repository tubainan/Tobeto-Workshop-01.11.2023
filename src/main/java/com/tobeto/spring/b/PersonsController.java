package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/personscontrol") //Bu controllerın kontrol edeceği alt routeları tanımlamak
public class PersonsController  {
     @GetMapping   // api/personscontrol
     public String get(){
          return "Person get edilerek getirildi" ;
     }
     @GetMapping("get2")  // api/personsconrol/get2
     public String get2(){
          return "Get 2";
     }

     @PostMapping
     public String post(){
          return  "Person post edilerek eklendi.";
     }
     @PutMapping
     public String put(){
          return "Person put edilerek güncellendi";
     }
     @DeleteMapping
     public String delete(){
          return "Person delete edildi";
     }
}

