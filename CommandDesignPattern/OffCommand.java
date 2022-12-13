package CommandDesignPattern;

public class OffCommand implements Command {
	
	Light light;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}
	
	public OffCommand(Light light) {
		this.light=light;
	}
}
