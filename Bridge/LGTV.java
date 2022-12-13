package Bridge;

public class LGTV implements TV {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("LGTV on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("LGTV off");
	}

	@Override
	public void tune(int channel) {
		// TODO Auto-generated method stub
		System.out.println("LGTV channel: "+channel);
	}

}
