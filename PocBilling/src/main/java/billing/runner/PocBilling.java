package billing.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="billing.entity,billing.service")
public class PocBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SpringApplication.run(PocBilling.class, args);
	}

}
