package com.tasteMusic.TasteMusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TasteMusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasteMusicApplication.class, args);
	}

}
