import java.util.Scanner;

public class J568 {

	public static void main(String[] args) {
		System.out.println("first array");
		Scanner sc = new Scanner(System.in);

		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];
		int[][] result = new int[2][4];

		// arr1 배열받기
		for (int i = 0; i < 2; i++) { //2행 
			for (int j = 0; j < 4; j++) { //4열 만큼 받기

				arr1[i][j] = sc.nextInt();
			}
		}

		// arr2 배열받기
		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {

				arr2[i][j] = sc.nextInt();
			}
		}

		// result 결과
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				result[i][j] = arr1[i][j] * arr2[i][j];

				
				if (result[i][j] == result[1][0]) {
					System.out.print("\n"); //줄바꿈해주기
				}
				System.out.print(result[i][j] + " ");

			}
		}

	}

}
