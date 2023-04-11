package es2pizza_resturant;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bevanda {
private String nome;
private int cal;
private double prezzo;

public Bevanda() {}

public Bevanda(String nome, int cal, double prezzo) {
	super();
	this.nome = nome;
	this.cal = cal;
	this.prezzo = prezzo;
}
public String stampa() {
	return nome + "Calorie " + cal + "Prezzo: " + prezzo;
}


}
