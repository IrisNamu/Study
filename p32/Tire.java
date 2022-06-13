package p32;

public class Tire {
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accumnlatedRotation; // 누적 회전수
	public String location; // 타이어 위치

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumnlatedRotation;
		if (accumnlatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + 
		(maxRotation - accumnlatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire");
			return false;
		}
	}

}
