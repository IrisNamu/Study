import java.util.Scanner;

public class J1303 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int num = 1;
		for (int i = 1; i <= n; i++) { //향
			for (int j = 1; j <= m; j++) { //열

				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

}
