package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class ReportController {

    @Autowired
    private WebClient webClient;


    @RequestMapping("/")
    public String loadHome(){
        return "home";
    }

    @RequestMapping("/report")
    public String loadReport(Model model){
        // call to down stream
        Flux<TollData> response = this.webClient
                .get()
                .uri("http://localhost:8083/api/tolldata")
                .retrieve()
                .bodyToFlux(TollData.class);

        List<TollData> tollData = response.collectList().block();
        model.addAttribute("tolldata", tollData);
        return "report";
    }
}
