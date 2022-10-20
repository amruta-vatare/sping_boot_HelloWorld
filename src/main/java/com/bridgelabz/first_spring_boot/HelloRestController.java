package com.bridgelabz.first_spring_boot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello from Bridgelabz";
    }

    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello "+name+" ! ";
    }
    
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+name+" ! ";
    }
    
    @PutMapping("/put/{firstName}")
    public String sayHelloAll(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello "+firstName+" "+lastName;
    }

    @PostMapping("/post")
    public String sayHelloUser(@RequestBody User user){
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" !";
    }

}

