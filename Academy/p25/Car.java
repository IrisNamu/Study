package p25;

public class Car {
	// 만약 Car클래스를 읽기 전용으로 만들고 싶다-> private로 만들고setter를 만들지 않으면 된다!
	private int speed;
	private boolean stop;

	public int getSpeed() { // 게터
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) { // 세터를 사용해서 외부에서 음수인 값을 넣게 되면 0으로 만들어줌
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() { // 게터
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
