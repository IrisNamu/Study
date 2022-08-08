import java.util.Scanner;

public class J186 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();
		sc.close();

		int word1length = word1.length();
		int word2length = word2.length();
		if (word1length < word2length) {
			System.out.println(word2length);
		} else {
			System.out.println(word1length);

		}
	}

}
