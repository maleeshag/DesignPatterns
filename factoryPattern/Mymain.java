package factoryPattern;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectFactory ob1=new objectFactory();
		shape s1=ob1.getShape("circle");
		
		objectFactory ob2=new objectFactory();
		shape s2=ob1.getShape("square");
		
		s1.display();
		s2.display();
	}

}
