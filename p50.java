import java.util.Arrays;

//�迭����

public class p50 {

	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores); //�迭�� ��ü �׺��� ������������ ����
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);

		}
System.out.println("---------------");

		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("scores[" + i + "]=" + names[i]);
		}
	}

}
