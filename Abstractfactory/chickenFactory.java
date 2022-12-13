package Abstractfactory;



public class chickenFactory implements AbstractFactory{
	public Chicken createChicken(String type) {
		
		
		
		if(type.equalsIgnoreCase("masala")) {
			return new masalaChicken();
		}
		
		if(type.equalsIgnoreCase("thandoori")) {
			return new thandooriChicken();
		}
		else {
			 return null;
		}
	}

	@Override
	public Dough createDough(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
