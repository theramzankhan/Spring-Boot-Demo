package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		@GetMapping
//		public String hello() {
//			return "Hello Ramzan! Keep it up!";
//		}

//		@GetMapping
//		public List<String> hello() {
//			return List.of("Hello",  "World");
//		}
		
		/*@GetMapping
		public List<Student> getStudents() {
			return List.of(
					new Student(
							1L,
							"Mariam",
							"mariam.jamal@gmail.com",
							LocalDate.of(2000, Month.JANUARY, 5),
							21
							)
					);
		}*/
	}
	
}
