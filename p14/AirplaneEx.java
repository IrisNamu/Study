package p14;

public class AirplaneEx {

	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane(); // �ν��Ͻ� ����

		// �޼��� ȣ��
		sa.takeOff(); // �̷��մϴ�.

		// �θ�Ŭ����, �ڽ�Ŭ���� �� �� ����. �ڽ� Ŭ���� fly�� ���� ȣ��
		sa.fly(); // �Ϲݺ����մϴ�..

		sa.flyMode = SuperAirplane.SUPER; // ������ ������...
		sa.fly();
		System.out.println("1");
		
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		System.out.println("2");
		
		sa.land(); // �����մϴ�.
	}

}
