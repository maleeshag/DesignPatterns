package Abstractfactory;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		FactoryProducer obj1=new FactoryProducer();
		
		AbstractFactory chicken=obj1.createPizza("chicken");
		Chicken mychoice =chicken.createChicken("thandoori");
		
		AbstractFactory dough=obj1.createPizza("Dough");
		Dough type=dough.createDough("double");
		
		mychoice.serveChicken();
		type.serveDough();
	}

}
