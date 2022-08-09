import java.util.Scanner;

public class J600 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
//next()는 개행문자를 무시하고 입력을 받고 nextLine은 한줄 단위로 입력을 받기 때문에 개행문자로 포함한다.
		
		int blank = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				blank++;
			}
		}
		System.out.print(blank+1);
	}
}