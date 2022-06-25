package Q2;

class Vehicle {

	 String color;
	 int speed;

	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;

	}

	 void show() {
		System.out.println("자동차 색상 : " + color);
		System.out.println("자동차 속도 : " + speed);
		

	}
}