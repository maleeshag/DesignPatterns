package CommandDesignPattern;

public class OnCommand implements Command {
	
	Light light;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}
	
	public OnCommand(Light light) {
		this.light=light;
	}

}
