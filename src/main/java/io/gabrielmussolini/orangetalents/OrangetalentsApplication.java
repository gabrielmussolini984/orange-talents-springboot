package io.gabrielmussolini.orangetalents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "io.gabrielmussolini.orangetalents.models")
@SpringBootApplication(scanBasePackages = "io.gabrielmussolini.orangetalents")
public class OrangetalentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangetalentsApplication.class, args);
	}

}
