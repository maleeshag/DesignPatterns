package AbstractFactoryShapes;

public class colorFactory implements AbstractShapeFactory{
	
	public Color selectColor(String color) {
		
		
		if(color.equalsIgnoreCase("Red")) {
			
			return new Red();
		}
		if(color.equalsIgnoreCase("green")) {
			return	new Green();
		}
		else {
			return null;
		}
		
	}

	@Override
	public Shape selectShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
