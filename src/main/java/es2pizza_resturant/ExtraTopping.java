package es2pizza_resturant;

public class ExtraTopping  extends Topping {
	private String nomeTopping;
	private double prezzoExtra;
 public ExtraTopping(Pizza pizza, String n, double d ) {
	 this.pizza = pizza;
	 this.nomeTopping= n;
	 this.prezzoExtra = d;
 }
	@Override
	public String stampa() {
		
		return pizza.stampa() + " extra " + nomeTopping  + " Prezzo: " +(pizza.getPrezzo()+prezzoExtra);
	}
	
	

}
