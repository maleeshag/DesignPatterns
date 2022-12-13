package templateDesignPattern;

public class MYLifeCycle extends Template{
	void start() {
		System.out.println("start");
	}
	
	void service() {
		System.out.println("service");
	}
	
	void stop() {
		System.out.println("stop");
	}
}
