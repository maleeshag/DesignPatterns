package StratergyPaternDuck;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck dk=new Duck();
		flyBehavior fb=new flyWithWings();
		
		dk.setfly(fb);
		dk.performFly();
		
		quackBehavior mq=new ModelQuack(); 
		
		dk.setQuack(mq);
		dk.performQuack();
		
	}	

}
