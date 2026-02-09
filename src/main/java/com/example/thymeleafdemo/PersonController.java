package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping
    public String getPeople(Model model){
        model.addAttribute("something", "this is coming from the controller");
        model.addAttribute("peopleInModel", Arrays.asList(
                new Person("John", 20),
                new Person("Sarah", 22),
                new Person("Simon", 23),
                new Person("Søren", 40),
                new Person("Lisa", 15)
        ));



        return "people";
    }
}
