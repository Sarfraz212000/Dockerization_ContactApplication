package in.saffu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.saffu.binding.Contact;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Contact c = new Contact();
		c.setContName("sarfraz");
		c.setCoontaId(101);
		c.setPhno(8406968023l);
		
		System.out.println(c);

	}
}
