package StratergyPaternDuck;

public class Duck {
	quackBehavior qB;
	flyBehavior fB;
	
	public void setfly(flyBehavior fB) {
		this.fB=fB;
	}
	
	public void setQuack(quackBehavior qB) {
		this.qB=qB;
	}
	
	
	void performQuack() {
		qB.quack();
	}
	
	
	void performFly() {
		fB.fly();
	}
	
	
	
}
