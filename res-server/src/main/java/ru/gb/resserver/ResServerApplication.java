package ru.gb.resserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Сервер ресурсов
 * См. https://www.baeldung.com/spring-security-oauth-auth-server
 */

@SpringBootApplication
public class ResServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResServerApplication.class, args);
	}

}
