import java.util.Arrays;

//배열정렬

public class p50 {

	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores); //배열의 전체 항복을 오름차순으로 정렬
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);

		}
System.out.println("---------------");

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("scores[" + i + "]=" + names[i]);
		}
	}

}
