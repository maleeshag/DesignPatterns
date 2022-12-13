package AbstractFactoryShapes;

public interface AbstractShapeFactory {
	
	public Color selectColor(String color);
	public Shape selectShape(String shape);
	
}
