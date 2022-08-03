import java.util.Scanner;

public class B2292 {

	public static void main(String[] args) {

//1 2~7 8~19 20~37 38~ 61 62~
		// 1 6*1+1 6*3+1 6*6+1 6*10+1
		// 0 1 3 6 10
		// 1 2 3 4 5 6 순으로 커지고 있음

		// 내가 입력한 숫자가 13
		// 1곱한것보다는 크고 3곱한것보다는 작음
// 1 6 12 18 24
// 6의 배수씩 커지고 있음

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int path = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (num >= 6 * i + 1 && num <= 6 * (i + 1) + 1) {
				i++;
				
					
//					i = 1+(1*path);
//					i= 1+path;
					path=1-i;
				System.out.println(i);
			//	System.out.println(path);
				
			}
		}
	}

}
