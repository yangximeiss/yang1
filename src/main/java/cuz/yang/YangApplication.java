package cuz.yang;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("cuz.yang.mapper")
public class YangApplication {
	@GetMapping("/")
	public String hello(){
		return "Hello Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(YangApplication.class, args);
	}

}
