package cuz.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YangApplication {
	@GetMapping("/")
	public String hello(){
		return "Hello Spring Boot";
	}

	@GetMapping("/student")
	public String getStudent(){
		return "I should list students in this page";
	}

	public static void main(String[] args) {
		SpringApplication.run(YangApplication.class, args);
	}

}
