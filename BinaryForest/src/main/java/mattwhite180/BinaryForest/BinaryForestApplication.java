package mattwhite180.BinaryForest;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BinaryForestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BinaryForestApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println();
			System.out.println("88888888888888888888888888888888888888888888888888888888888888");
			System.out.println("88888888888888888888888888888888888888888888888888888888888888");
			System.out.println("8888                                                      8888");
			System.out.println("8888   Go to http://localhost:8080/ in your web browser   8888");
			System.out.println("8888                                                      8888");
			System.out.println("88888888888888888888888888888888888888888888888888888888888888");
			System.out.println("88888888888888888888888888888888888888888888888888888888888888");
			System.out.println();

			/*
			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
			*/

		};
	}

}