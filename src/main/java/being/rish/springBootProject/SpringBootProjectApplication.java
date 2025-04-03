package being.rish.springBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //works all the three annotations
// @Configuration -> used with @Bean annotation is used for configuration
// @EnableAutoConfiguration -> Automatic configure
// @ComponentScan -> scan the IOC(Inversion of control)

// Application context is a way to achieve IOC container
// Bean -> Class is automatically registered as a Spring bean,
// when we do @Component to any that particular class

// We can create bean using @Configuration annotation to the class.
// @Been annotation used to the methods only.
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

}
