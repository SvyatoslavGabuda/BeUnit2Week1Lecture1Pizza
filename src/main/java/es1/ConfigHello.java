package es1;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable
public class ConfigHello {
@Bean
public Hello h() {
	return new Hello("World");
	
}
@Bean
@Scope("prototype")
public Hello h1(String n) {
	return new Hello(n);
}

}
