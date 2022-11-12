import java.util.Scanner;

public class J1291 { 
 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		sc.close();

		int result;
		for (int i = 1; i < 10; i++) {
			result = s * i;
			System.out.println(s + " * " + i + " = " + result);
		}
	}
}
