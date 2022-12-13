package test;

public class factoryPizza {
	
	String type;
	
	public pizza gettype(String type) {
		
		if(type.equalsIgnoreCase("chicken")) {
			
			return new chickenPizza();
			
			
		}
		
		if(type.equalsIgnoreCase("veggi")) {
			
			return new veggie();
			
		}
		else
			return null;
		
		
		
		
		
	}
	
}
