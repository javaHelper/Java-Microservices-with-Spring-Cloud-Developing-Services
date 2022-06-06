package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class TollController {
    @Autowired
    private WebClient webClient;

    @GetMapping("/")
    public Mono<TollData> getLatestToll(){
        Flux<TollData> response = this.webClient
                .get()
                .uri("http://localhost:8083/api/tolldata")
                .retrieve()
                .bodyToFlux(TollData.class);

        List<TollData> tollData = response.collectList().block();
        return Mono.just(tollData.get(0));
    }
}
