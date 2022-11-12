package p18;

public class SportsCar extends Car {
	public void speedUp() { //정상적으로 오버라이딩이 됨.
		speed += 10;
	}

	public void stop() { // 에러!! Cannot override the final method from Car
		System.out.println("SportsCar를 멈춤");
		speed = 0;
	}
}
