
public class p59 {

	public static void main(String[] args) {
		// abs ���눩
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 : " + v1); // 5
		System.out.println("v2 : " + v2); // 3.14

		// ceil �ø���
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 : " + v3); // 6.0
		System.out.println("v4 : " + v4); // -5.0

		// floor ������
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 : " + v5); // 5.0
		System.out.println("v6 : " + v6); // -6.0

		// max �ִ밪
		double v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 : " + v7); // 9.0
		System.out.println("v8 : " + v8); // 5.3

		// min : �ּڰ�
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 : " + v9); // 5
		System.out.println("v10 : " + v10); // 2.5

		// random : 0.0�̻� 1.0�̸� �� �� ������ ���
		double v11 = Math.random();
		System.out.println("v11 : " + v11);

		// rint : ����� ������ �Ǽ���
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 : " + v12); // 5.0
		System.out.println("v13 : " + v13); // 6.0

		// Math.round: �ݿø���
		double v14 = Math.round(5.3);
		double v15 = Math.round(5.7);
		System.out.println("v14 : " + v14); // 5.0
		System.out.println("v15 : " + v15); // 6.0

		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("v16 : " + v16);

	}

}
