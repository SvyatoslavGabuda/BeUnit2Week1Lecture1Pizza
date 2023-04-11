package BeUnit2Week1Lecture1Pizza.BeUnit2Week1Lecture1Pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import es1.ConfigHello;
import es1.Hello;
import es2pizza_resturant.ExtraTopping;
import es2pizza_resturant.Pizza;
import es2pizza_resturant.PizzaMargherita;


@SpringBootApplication
public class BeUnit2Week1Lecture1PizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeUnit2Week1Lecture1PizzaApplication.class, args);
		
		Pizza marg = new ExtraTopping(new PizzaMargherita(), "mozzarella" ,0.5);
		System.out.println(marg.stampa());
		
		Pizza margex = new ExtraTopping(marg,"mozzarella",0.5);
		System.out.println(margex.stampa());
	}

	public static void primoBean() {
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(ConfigHello.class);
		Hello h1 = (Hello) appContext.getBean("h");
		h1.sayHello();
		Hello h2 = (Hello) appContext.getBean("h1","worldworld");
		h2.sayHello();
		appContext.close();
	}
}
