package factoryPattern;
//this is the factory class
public class objectFactory {
	
	public shape getShape(String name) {
		
		if(name==null) {
			return null;
		}
		
		else if(name.equalsIgnoreCase("circle")) {
			return new circle();
		}
		
		else if(name.equalsIgnoreCase("square")) {
			return  new square();
		}
		else if(name.equalsIgnoreCase("rectangle")) {
			return new rectangle();
		}
		else {
			return null;
		}
		
	}
	
}
//equalsIgnoreCase("  "):- method compares two strings, ignoring lower case and upper case differences.