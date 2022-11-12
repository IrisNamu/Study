import java.util.Scanner;

public class J601 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		for (int j = str.length() - 1; j >= 0; j--) { // 6~0
			System.out.print(str.substring(j));
			System.out.println(str.substring(0, j));
		}
	}
}

//import java.util.Scanner;
//
//public class J601 {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      String str = sc.next();
//      sc.close();
//      
//      for(int i = 1; i <= str.length(); i++) {
//         /*
//          * substring(문자열 자르기)으로 기준위치(i)를 기준으로 잘라서
//          * [i부터끝까지] + [0(처음)부터 기준위치(i)까지]로 출력한다.
//          */
//         System.out.println(str.substring(str.length()-i) + str.substring(0,str.length()-i));
//      }
//   }
//}