import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		// 최댓값 변수선언

		double max = 0;
		// 점수 입력받기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			// 점수 중 최댓값 구하기
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		sc.close();

		// 수정한 모든 점수와 총합 변수 선언
		double edit = 0;
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			edit = arr[i] / max * 100;
			sum += edit;
		}
		System.out.println(sum / N);
	}
}
