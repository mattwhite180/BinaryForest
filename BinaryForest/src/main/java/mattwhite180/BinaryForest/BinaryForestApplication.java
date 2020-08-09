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

			// Dino from `cowsay -f stegosaurus Go to http://localhost:8080/ in your web browser`
			System.out.println();
			System.out.println("888888888888888888888888888888888888888888888888888888888888888888888888888888888");
			System.out.println("888888888888888888888888888888888888888888888888888888888888888888888888888888888");
			System.out.println("888888 ______________________________________                              888888");
			System.out.println("888888/ Go to http://localhost:8080/ in your \\                             888888");
			System.out.println("888888\\ web browser                          /                             888888");
			System.out.println("888888 --------------------------------------                              888888");
			System.out.println("888888 \\                             .       .                             888888");
			System.out.println("888888  \\                           / `.   .' \"                            888888");
			System.out.println("888888   \\                  .---.  <    > <    >  .---.                    888888");
			System.out.println("888888    \\                 |    \\  \\ - ~ ~ - /  /    |                    888888");
			System.out.println("888888          _____          ..-~             ~-..-~                     888888");
			System.out.println("888888         |     |   \\~~~\\.'                    `./~~~/                888888");
			System.out.println("888888        ---------   \\__/                        \\__/                 888888");
			System.out.println("888888       .'  O    \\     /               /       \\  \"                   888888");
			System.out.println("888888      (_____,    `._.'               |         }  \\/~~~/             888888");
			System.out.println("888888       `----.          /       }     |        /    \\__/              888888");
			System.out.println("888888             `-.      |       /      |       /      `. ,~~|          888888");
			System.out.println("888888                 ~-.__|      /_ - ~ ^|      /- _      `..-'          888888");
			System.out.println("888888                      |     /        |     /     ~-.     `-. _  _  _ 888888");
			System.out.println("888888                      |_____|        |_____|         ~ - . _ _ _ _ _>888888");
			System.out.println("888888888888888888888888888888888888888888888888888888888888888888888888888888888");
			System.out.println("888888888888888888888888888888888888888888888888888888888888888888888888888888888");
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