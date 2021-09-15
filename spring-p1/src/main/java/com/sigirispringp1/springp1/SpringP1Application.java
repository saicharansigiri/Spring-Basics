package com.sigirispringp1.springp1;

import com.sigirispringp1.springp1.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SpringP1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringP1Application.class, args);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();
	}

}
