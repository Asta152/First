package com.example.demo;

import com.example.demo.books.Bok;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping
	public List<Bok> hello(){
		return List.of(
				new Bok(1,"Elden RIng",500,39,"Miyazaki" ),
				new Bok(2,"Bloodborne",300,29,"Miyazaki" )
		);
	}
}
