package br.com.visionview.visionview;

import br.com.visionview.visionview.main.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisionviewApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(VisionviewApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
