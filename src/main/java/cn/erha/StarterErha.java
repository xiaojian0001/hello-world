package cn.erha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.erha.mapper")
public class StarterErha {
 
	public static void main(String[] args) {
		SpringApplication.run(StarterErha.class, args);
	}
}
