package es1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Hello {
private String contenuto;

public void sayHello() {
	System.out.println("Hello" + contenuto);
}




}
