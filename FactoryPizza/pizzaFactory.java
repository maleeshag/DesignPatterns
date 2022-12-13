package FactoryPizza;

public class pizzaFactory {
	
	String pizzaType;
	
	public PIzza createPizza(String pizzaType) {
		
		if(pizzaType.equalsIgnoreCase("veggie")) {
			return new vegPizza();
		}
		
		if(pizzaType.equalsIgnoreCase("chicken")) {
			return new chickenPizza();
		}
		
		if(pizzaType.equalsIgnoreCase("cheese")) {
			return new CheesPizza();
		}
		else {
			 return null;
		}
		
	}
}
