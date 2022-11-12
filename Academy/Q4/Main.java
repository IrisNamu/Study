package Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();

		int obesity = weight + 100 - height;
		if (obesity > 0) {
			System.out.println(obesity + "\nObesity");
		} else {
			System.out.println(obesity);
		}

	}

}
