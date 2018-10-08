package microservicesmediumcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesMediumComApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesMediumComApplication.class, args);
	}
}
