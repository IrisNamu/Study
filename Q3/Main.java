package Q3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1; // 1���� inp �� ���� �ϳ��� �������ѳ��� ��
		int sum = 0;

		int inp = sc.nextInt();
		while (i <= inp) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		sc.close();
	}
}
