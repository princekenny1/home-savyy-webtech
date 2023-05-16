package home_savyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
// import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootApplication
public class home_savyy extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(home_savyy.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(home_savyy.class, args);

	}


}
