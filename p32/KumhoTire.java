package p32;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	//�ڵ��� ���� ȸ��
	//���� �ʰ��ϸ� ��ũ, �ƴϸ� ��� ����
	public boolean roll() {
		++accumnlatedRotation;
		if (accumnlatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ���� : " 
		+ (maxRotation - accumnlatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false;
		}

	}
}
