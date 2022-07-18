package sg.edu.nus.iss.d11workshop;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class D11workshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(D11workshopApplication.class, args);

		String port = "8080";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		
		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0);
			}
		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);
	
		}
}

