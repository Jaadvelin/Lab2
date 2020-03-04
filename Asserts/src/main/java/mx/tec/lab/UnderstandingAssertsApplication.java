package mx.tec.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnderstandingAssertsApplication {
	public void methodThatShouldThrowException() {
		throw new UnsupportedOperationException("Operation will fail");
	}
}



