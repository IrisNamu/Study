import java.util.Arrays;

public class p51 {
//배열 항목검색
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]= " + scores[i]);
		}
		//﻿binarySearch(배열,찾는값)
		//	전체 배열 항목에서 찾는 값이 있는 인덱스 리턴
		int index = Arrays.binarySearch(scores, 10);
		System.out.println("index : " + index);
	}

}
