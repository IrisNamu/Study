import java.util.Scanner;

public class J291 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		sc.close();

		if (s < 2 || s > 9 || e < 2 || e > 9) {
			System.out.println("INPUT ERROR!");
		}

		int num1 = 1;
		int num2 = 1;
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < i; j++) {

				num1 = s * i;
				num2 = e * j;
				System.out.printf("%d * %d = %d \n", s, i, num1);
				System.out.printf("%d * %d = %d", s, i, num2);
			}
		}
		System.out.println();
	}

}
