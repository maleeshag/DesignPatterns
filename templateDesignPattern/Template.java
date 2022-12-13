package templateDesignPattern;

public abstract class Template {
	
	
	final void template() {
		start();
		service();
		stop();
	}
	
	abstract void start();
	
	abstract void service();
	
	abstract void stop();
	
	
}
