import java.util.Scanner;

public class J1314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < i + n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
