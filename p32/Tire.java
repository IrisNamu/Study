package p32;

public class Tire {
	public int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	public int accumnlatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumnlatedRotation;
		if (accumnlatedRotation < maxRotation) {
			System.out.println(location + "Tire ����: " + 
		(maxRotation - accumnlatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire");
			return false;
		}
	}

}
