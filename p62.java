import java.util.Arrays;
import java.util.Random;

public class p62 {

	public static void main(String[] args) {
		int[] selectNumber = new int[6]; // ���� ��ȣ 6���� ����� �迭

//		 ��÷ ��ȣ ���� ���ڰ��� �ָ� ��� ��÷!
//		�׸��� ���ڰ��� �������� ������ �Ź� �ٸ� ��ȣ�� ������ 
//		���ڰ��� �������ָ� ��� �����ϴ��� ��� ���� ��ȣ�� ����
		Random random = new Random(3); // ���� ��ȣ�� ��� ���� Random ��ü ����
		System.out.println("���� ��ȣ : ");

		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; // ���� ��ȣ�� ��� �迭�� ����
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		int[] winningNumber = new int[6]; // ��÷ ��ȣ�� 6���� ����� �迭
		random = new Random(9); // ��÷ ��ȣ�� ��� ���� Random ��ü ����
		System.out.println("��÷ ��ȣ : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1; // ��÷ ��ȣ�� ��� �迭�� ����
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		// ��÷����
		Arrays.sort(selectNumber); // �������� ����
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber); // �迭 �׸� ������ ��
		System.out.print("��÷ ���� : ");
		if (result) {
			System.out.println("�����մϴ�! ��÷ �Ǽ̽��ϴ�!");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}

}
