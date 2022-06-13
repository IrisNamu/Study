package p32;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	//자동차 바퀴 회전
	//수명 초과하면 펑크, 아니면 계속 진행
	public boolean roll() {
		++accumnlatedRotation;
		if (accumnlatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " 
		+ (maxRotation - accumnlatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}

	}
}
