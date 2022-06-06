package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class WebFunctionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFunctionsApplication.class, args);
	}

	List<TollStation> tollStations;

	public WebFunctionsApplication(){
		tollStations = new ArrayList<>();
		tollStations.add(new TollStation("100A", 112.5f, 2));
		tollStations.add(new TollStation("111C", 124f, 4));
		tollStations.add(new TollStation("112C", 126f, 2));
	}

	@Bean
	public Function<String, TollStation> getStation(){
		return value ->{
			System.out.println("Received request for station - "+value);
			return tollStations.stream()
					.filter(tollStation -> value.equals(tollStation.getStationId()))
					.findAny()
					.orElse(null);
		};
	}

	@Bean
	public Consumer<TollRecord> processTollRecord(){
		return value -> {
			System.out.println("Received toll for each car with the license plate : "
					+value.getLicensePlate());
		};
	}

	@Bean
	public Function<TollRecord, Mono<Void>> processTollRecordReactive(){
		return value -> {
			System.out.println("Received reactive toll for each car with the license plate : "
					+value.getLicensePlate());
			return Mono.empty();
		};
	}

	@Bean
	public Consumer<Flux<TollRecord>> processListOfTollRecordsReactive(){
		return value -> {
			value.subscribe(toll -> System.out.println(toll.getLicensePlate()));
		};
	}

	@Bean
	public Supplier<Flux<TollStation>> getTollStations(){
		return () -> Flux.fromIterable(tollStations);
	}
}
