package AbstractFactoryShapes;

public class FactoryProducer {
	
	public static AbstractShapeFactory give(String type) {
		
		if(type.equalsIgnoreCase("Shape")) {
			return new shapeFactory();
		}
		if(type.equalsIgnoreCase("color")) {
			return new colorFactory();
		}
		
		return null;
		
	}
}
