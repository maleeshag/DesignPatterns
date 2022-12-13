package CommandDesignPattern;

public class RemoteController {
	Command oncom;
	Command offcom;
	
	
	void setOnCommand(Command oncom,Command offcom) {
		this.oncom=oncom;
		this.offcom=offcom;
	}
	
	void OnButtonPush() {
		oncom.execute();
	}
	
	void OffButtonPush() {
		offcom.execute();
	}
	
	
}
