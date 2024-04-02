package gioelefriggia.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import gioelefriggia.u5d1.entities.Menu;

@SpringBootApplication
public class u5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(u5d1Application.class, args);

		// Utilizziamo il contesto di Spring per ottenere il bean del menù e stamparne il contenuto
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(u5d1Application.class)) {
			Menu menu = context.getBean(Menu.class);
			menu.printMenu();
		}
	}
}