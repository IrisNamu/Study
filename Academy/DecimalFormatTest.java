package study;

import java.text.DecimalFormat;

//���� ���� Ŭ���� DemicalFormat
public class DecimalFormatTest {
	public static void main(String[] args) {

		// ��ȯ�� ��
		double num = 12345.6789;

		// 10���� - ���ڸ��� 0���� ä��
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num)); // ��°� : 12346

		// 10���� - ���ڸ��� 0���� ä��
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num)); // ��°� : 12345.7

		// 10���� - ���ڸ��� 0���� ä��
		df = new DecimalFormat("000000.00000");
		System.out.println(df.format(num)); // ��°� : 012345.67890

		// 10���� - ���ڸ��� ä���� ����
		df = new DecimalFormat("#");
		System.out.println(df.format(num)); // ��°� : 12346

		// 10���� - ���ڸ��� ä���� ����
		df = new DecimalFormat("######.###");
		System.out.println(df.format(num)); // ��°� : 12345.679

		// 10���� - # 0 ���� / ���������� ���� , �߰�
		df = new DecimalFormat("#,###.00000");
		System.out.println(df.format(num)); // ��°� : 12,345.67890

		// 100�� ���� �� ���ڿ� % ����
		df = new DecimalFormat("#.##%");
		System.out.println(df.format(num)); // ��°� : 1234567.89%

		// ��ȭǥ�� \u00A4
		df = new DecimalFormat("\u00A4####.##");
		System.out.println(df.format(num)); // ��°� : ��12345.68

	}
}
