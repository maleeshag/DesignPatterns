package AbstractFactoryShapes;

public class shapeFactory implements AbstractShapeFactory{
	
	public Shape selectShape(String shape) {
		
		
		if(shape.equalsIgnoreCase("rectangle")) {
			
			return new Rectangle();
		}
		if(shape.equalsIgnoreCase("square")) {
			return	new Square();
		}
		else {
			return null;
		}
		
	}

	@Override
	public Color selectColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
