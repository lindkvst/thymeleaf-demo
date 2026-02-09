package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
@Controller
@RequestMapping("date")
public class DateController {

    @GetMapping("today")
    public String getDayOfWeek(Model model) {
        model.addAttribute("day", LocalDate.now().getDayOfWeek().toString().toLowerCase());
        return "showtoday";
    }

}
