import java.util.Scanner;

public class B8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cnt = 0;
		int sum = 0;

		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				} else if (arr[i].charAt(j) == 'X') {
					cnt = 0;
				}
			}
			// 출력문
			System.out.println(sum);
			cnt = 0;
			sum = 0;
		}
		sc.close();
	}
}