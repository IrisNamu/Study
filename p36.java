
public class p36 {

	public static void main(String[] args) {
		String ssn = "870913-1234567";

		// 0,6 -> �ε��� 0������ 6�� �ε��������� �κй��ڿ��� ���� ����!
		String firstNum = ssn.substring(0, 6);

		// �ε��� 7������ ������ �κй��ڿ��� �����Ѵ�.
		String secondNum = ssn.substring(7);

		System.out.println("firstNum : " + firstNum);
		System.out.println("secondNum : " + secondNum);

	}

}
