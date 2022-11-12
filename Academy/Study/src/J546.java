import java.util.Scanner;

public class J546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n]; // n개 과목을 배열로 받기

		int sum = 0;
		double avg = 0.0;

		// n개 과목의 점수를 입력받아 배열에 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i]; // 과목의 총 합 구하기
		}
		avg = (double) sum / n; // 나누는값에 double형이 있어야 소수점도 나온다.
		if (avg >= 80) { // 80점 이상이면 "pass"
			System.out.printf("avg : %.1f\npass", avg);
		} else {
			System.out.printf("avg : %.1f\nfail", avg);
		}
		sc.close();
	}

}
