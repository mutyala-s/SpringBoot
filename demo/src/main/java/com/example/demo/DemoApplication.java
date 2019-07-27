package com.example.demo;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.example.demo.service.SoccerService;

@SpringBootApplication(scanBasePackages = { "com.example.demo" })
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}
// @EntityScan("com.springtransaction.*") for scaning the model classes
//@@EnableJpaRepositories(basePackages = "com.springbootdev.examples.jpa.repositories")
//@EntityScan(basePackages = "com.springbootdev.examples.entity")
public class DemoApplication implements CommandLineRunner, Banner {

	@Autowired
	SoccerService soccerService;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
		// SpringApplication.run(DemoApplication.class, args);

		System.out.println("In main method....");
		Collections c;
	}

	@Override

	public void run(String... arg0) throws Exception {

		soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);

		List<String> players = soccerService.getAllTeamPlayers(1);

		for (String player : players)

		{

			System.out.println("Introducing Barca player => " + player);

		}

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				// System.out.println(beanName);
			}

		};
	}

	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {

	}
}
