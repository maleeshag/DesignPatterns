package test;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factoryPizza obj=new factoryPizza();
		
		pizza hm=obj.gettype("chicken");
		
		hm.servepizza();
		
		
	}

}
