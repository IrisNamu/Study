package collection_framework;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		Integer score = null;

		// 가장 낮은 값의 객체 리턴
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score); //75

		// 가장 높은 값의 객체 리턴
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score); //98

		score = scores.lower(95);
		System.out.println("95점 아래 점수 : " + score); // 87

		score = scores.higher(95);
		System.out.println("95점 아래 점수 : " + score); //98

		score = scores.floor(95);
		System.out.println("95점 이거나 바로 아래 점수 : " + score); //95

		score = scores.ceiling(85);
		System.out.println("85점 이거나 바로 위의 점수 : " + score); //87

		while (!scores.isEmpty()) {
			score = scores.pollFirst();// 가장 낮은 값 꺼내고 삭제. 오름차순
			System.out.println(score + "남은 객체 수: " + scores.size() + ")");
		} 
/*		75남은 객체 수: 4)
		80남은 객체 수: 3)
		87남은 객체 수: 2)
		95남은 객체 수: 1)
		98남은 객체 수: 0)
*/

	}

}
