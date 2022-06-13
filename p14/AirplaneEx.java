package p14;

public class AirplaneEx {

	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane(); // 인스턴스 생성

		// 메서드 호출
		sa.takeOff(); // 이륙합니다.

		// 부모클래스, 자식클래스 둘 다 있음. 자식 클래스 fly가 먼저 호출
		sa.fly(); // 일반비행합니다..

		sa.flyMode = SuperAirplane.SUPER; // 초음속 비행중...
		sa.fly();
		System.out.println("1");
		
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		System.out.println("2");
		
		sa.land(); // 착륙합니다.
	}

}
