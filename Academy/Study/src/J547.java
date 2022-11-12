
public class J547 {

	public static void main(String[] args) {

		for (int i = 2; i < 7; i++) { // 2 3 4 5 6
			for (int j = i; j < i + 5; j++) { //2~6, 3~7, 4~8까지 출력
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
