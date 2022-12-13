package StratergyPattern;

interface FlyBehavior{
	public void fly();
}

interface SpeakBehavior{
	public void speak();
}

class speakLoudly implements SpeakBehavior{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("seak loudly");
	}
	
}

class speakSlowly implements SpeakBehavior{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("seak slow");
	}
	
}

class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly with wings");
	}
	
}
class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("can't fly");
	}
	
	
}

class FlyFast implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly faster");
	}
	
	
}


class Bird{
	FlyBehavior flyBehavior;
	SpeakBehavior speakBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior=flyBehavior;
	}
	
	void performFly() {
		this.flyBehavior.fly();
	}
	
	public void setSpeakBehavior(SpeakBehavior speakBehavior) {
		 this.speakBehavior=speakBehavior;
	}
	
	void performSpeak() {
		this.speakBehavior.speak();
	}
}

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird=new Bird();
		FlyBehavior flyBehavior=new FlyWithWings();
		
		
		bird.setFlyBehavior(flyBehavior);
		bird.performFly();
		
		
		bird.setFlyBehavior(new FlyNoWay());
		bird.performFly();
		
		
		bird.setSpeakBehavior(new speakLoudly());
		bird.performSpeak();
		
		
	}

}
