package FactoryPizza;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pizzaFactory ob=new pizzaFactory();
		
		PIzza pizza=ob.createPizza("cheese");
		
		pizza.servePizza();
	}

}
