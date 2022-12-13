package Abstractfactory;

public class DoughFactory implements AbstractFactory{
	
	public Dough createDough(String type) {
		
		
		
		if(type.equalsIgnoreCase("thin")) {
			return new thinDough();
		}
		
		if(type.equalsIgnoreCase("double")) {
			return new doubleLayer();
		}
		else {
			 return null;
		}
	}

	@Override
	public Chicken createChicken(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
