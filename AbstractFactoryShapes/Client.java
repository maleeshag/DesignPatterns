package AbstractFactoryShapes;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractShapeFactory obj=FactoryProducer.give("shape");
		Shape shape=obj.selectShape("rectangle");
		
		
		AbstractShapeFactory obj1=FactoryProducer.give("color");
		Color color=obj1.selectColor("green");
		
		
		shape.displayShape();
		color.displayColor();
	}

}
