
public class p33 {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";

		int location = subject.indexOf("����"); // ó�������ϴ� �ε����� ã���ִ� ��.
		System.out.println("location : " + location);

		if (subject.indexOf("�ڹ�") != -1) { // ���� ã�� ���ڿ��� ���ٸ� ���ϰ��� -1�̴�.
			System.out.println("�ڹٿ� ������ �ֽ��ϴ�.");
		} else {
			System.out.println("�ڹٿ� ������ �����ϴ�.");
		}
	}

}
