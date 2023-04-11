package es2pizza_resturant;

public abstract class Pizza {
 String nome;
 double prezzo;
 
 
 public Pizza() {
	super();
}

public String stampa() {
	 return nome;
 }
 public String getNome() {
	 return nome;
 }

public double getPrezzo() {
	return prezzo;
}

public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
}

public void setNome(String nome) {
	this.nome = nome;
}
}
