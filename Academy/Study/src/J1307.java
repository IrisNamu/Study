import java.util.Scanner;

public class J1307 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		char ch = 'A';
		char[][] arr = new char[n][n];

		/*
		 * 3,3
		 * 3,2
		 * 3,1
		 * 3,0
		 * 
		 * 2,3
		 * 2,2
		 * 2,1
		 * 2,0
		 * ..
		 */
	
		for (int i = n - 1; i >= 0; i--) { 
			for (int j = n - 1; j >= 0; j--) {
				if (ch > 'Z')
					ch = 'A';
				arr[i][j] = ch++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
