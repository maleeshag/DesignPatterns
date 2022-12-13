package Abstractfactory;

public class FactoryProducer{

	
	
	public AbstractFactory createPizza(String type) {
		
		
		
		if(type.equalsIgnoreCase("chicken")) {
			return new chickenFactory();
		}
		
		if(type.equalsIgnoreCase("dough")) {
			return new DoughFactory();
		}
		else {
			 return null;
		}
	}
	

}
