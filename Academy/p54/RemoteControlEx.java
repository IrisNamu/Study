package p54;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
