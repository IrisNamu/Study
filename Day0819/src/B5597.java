import java.util.Scanner;

public class B5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[28];
		
		int s1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);

		}
		sc.close();
	}
}
