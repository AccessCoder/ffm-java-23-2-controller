package de.neuefische.ffmjava232controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping
    public String sayHello(){
        return "Hallo Welt";
    }

    @GetMapping("/{name}/{lastName}")
    public String sayHello2(@PathVariable String name, @PathVariable String lastName){
        return "Hallo " + name +" " + lastName;
    }

    @GetMapping("/persons")
    public String listAll(@RequestParam String person1, @RequestParam String person2){
        return person1 + " " + person2;
    }

    @PostMapping()
    public String postNewString(@RequestBody Person2 person){
        return person.getName();
    }
}
