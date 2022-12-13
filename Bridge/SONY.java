package Bridge;

public class SONY implements TV {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("SONY on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("SONY off");
	}

	@Override
	public void tune(int channel) {
		// TODO Auto-generated method stub
		System.out.println("SONY channel: "+channel);
	}

}
