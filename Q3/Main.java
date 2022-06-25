package Q3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1; // 1부터 inp 수 까지 하나씩 증가시켜나갈 값
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
