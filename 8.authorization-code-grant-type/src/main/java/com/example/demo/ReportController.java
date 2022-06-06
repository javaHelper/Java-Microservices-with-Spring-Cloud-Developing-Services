package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportController {

    @RequestMapping("/")
    public String loadHome(){
        return "home";
    }

    @RequestMapping("/report")
    public String loadReport(Model model){
        model.addAttribute("recordId", "110A");
        model.addAttribute("licensePlate","MH 31 AR 1111");
        model.addAttribute("timestamp", "2022-05-05T08:00:00");
        return "report";
    }
}
