package p18;

public class SportsCar extends Car {
	public void speedUp() { //���������� �������̵��� ��.
		speed += 10;
	}

	public void stop() { // ����!! Cannot override the final method from Car
		System.out.println("SportsCar�� ����");
		speed = 0;
	}
}
