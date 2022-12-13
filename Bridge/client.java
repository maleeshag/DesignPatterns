package Bridge;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV lgtv=new LGTV();
		
		new remoteControllerImp1(lgtv).on();
		new remoteControllerImp1(lgtv).off();
		new remoteControllerImp1(lgtv).tune(20);
		
		
		TV SonyTv=new SONY();
		
		new remoteControllerImp1(SonyTv).on();
		new remoteControllerImp1(SonyTv).off();
		new remoteControllerImp1(SonyTv).tune(100);
	}

}
