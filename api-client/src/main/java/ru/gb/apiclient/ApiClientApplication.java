package ru.gb.apiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Перед запуском по всей видимости надо запускать сервер аутентификации
 * См. https://www.baeldung.com/spring-security-oauth-auth-server
 */
@SpringBootApplication
public class ApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiClientApplication.class, args);
	}

}
