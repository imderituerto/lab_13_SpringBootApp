package com.example.task_01.controllers;

import com.example.task_01.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Create a controller which accepts requests made to `http://localhost:8080/greeting`.
@RestController
public class NameController {

    //Create a method which accepts a `GET` request and returns a string saying "Good afternoon <yourname>!", eg. `"Good afternoon Colin!"`
/*
    @GetMapping("/greeting")
        public String greeting(@RequestParam(value = "name") String name) {
        return "Good afternoon " + name + "!";
    }
*/

    //Refactor your controller to use your POJO instead of a string
    @GetMapping("/greeting")
    public String fullGreeting(@RequestParam String name, String timeOfDay){
        return String.format("Good afternoon " + name + "! The time is " + timeOfDay);
    }

}


