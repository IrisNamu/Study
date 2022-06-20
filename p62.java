import java.util.Arrays;
import java.util.Random;

public class p62 {

	public static void main(String[] args) {
		int[] selectNumber = new int[6]; // 선택 번호 6개가 저장될 배열

//		 당첨 번호 같은 종자값을 주면 계속 당첨!
//		그리고 종자값을 지정하지 않으면 매번 다른 번호가 나오고 
//		종자값을 지정해주면 계속 실행하더라도 계속 같은 번호가 나옴
		Random random = new Random(3); // 선택 번호를 얻기 위한 Random 객체 생성
		System.out.println("선택 번호 : ");

		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; // 선택 번호를 얻어 배열에 저장
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		int[] winningNumber = new int[6]; // 당첨 번호가 6개가 저장될 배열
		random = new Random(9); // 당첨 번호를 얻기 위한 Random 객체 생성
		System.out.println("당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1; // 당첨 번호를 얻어 배열에 저장
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		// 당첨여부
		Arrays.sort(selectNumber); // 오름차순 정렬
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber); // 배열 항목값 같은지 비교
		System.out.print("당첨 여부 : ");
		if (result) {
			System.out.println("축하합니다! 당첨 되셨습니다!");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
