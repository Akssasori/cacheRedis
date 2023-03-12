package com.lucas.caheRedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CaheRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaheRedisApplication.class, args);
	}

}
