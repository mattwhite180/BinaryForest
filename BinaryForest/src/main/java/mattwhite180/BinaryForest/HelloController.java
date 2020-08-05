package mattwhite180.BinaryForest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/helloworld")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}