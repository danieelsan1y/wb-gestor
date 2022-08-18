package br.com.dagosolutions.WBGestor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class WbGestorApplication {

	public static void main(String[] args) {
		SpringApplication.run(WbGestorApplication.class, args);
	}
}
