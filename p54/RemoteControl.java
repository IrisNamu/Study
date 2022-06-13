package p54;

//인터페이스안에는 상수와, 추상메서드
public interface RemoteControl {

	public int MAX_VOLUME = 10; //상수
	public int MIN_VOLUME = 0;

	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	// 디폴트 메서드 디폴트 붙이면 실제 클래스..지동으로 상속받음
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}

	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");

	}

}
