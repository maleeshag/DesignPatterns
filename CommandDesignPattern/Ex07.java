package CommandDesignPattern;



public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteController rm=new RemoteController();
		
		Light livingRoom=new LivingRoomLight();
		
		Light bedRoom=new BedRoomLight();
		
		
		Command cm=new OnCommand(bedRoom);
		Command cm1=new OffCommand(livingRoom);
		
		rm.setOnCommand(cm,cm1);
		
		rm.OnButtonPush();
		rm.OffButtonPush();
		
	}

}
