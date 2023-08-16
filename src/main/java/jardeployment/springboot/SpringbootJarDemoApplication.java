package jardeployment.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJarDemoApplication {
    @GetMapping("/Welcome")
	public String Welcome(){
		return "Spring Boot jar file deployment demo";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJarDemoApplication.class, args);
	}

}
