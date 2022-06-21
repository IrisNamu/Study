package collection_framework;

import java.util.Map;
import java.util.TreeMap;

public class HashTableEx3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put((87), "최 산");
		scores.put((98), "윈터");
		scores.put((75), "권순영");
		scores.put((95), "이도겸");
		scores.put((80), "김자바");

		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry(); // 제일 낮은 Map.Entry를 리턴
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.lastEntry(); // 제일 높은 Map.Entry를 리턴
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.lowerEntry(95); //주어진 키보다 바로 아래 Map.Entry를 리턴
		System.out.println("95점 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.higherEntry(95); //주어진 키보다 바로 위 Map.Entry를 리턴
		System.out.println("95점 위의 점수 : " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.floorEntry(95); //주어진 키와 동등한 키가 있다면 해당 Map.Entry를 리턴
										//없으면 주어진 키 바로 아래의 Map.Entry를 리턴
		System.out.println("95점 이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.ceilingEntry(85); //주어진 키와 동등한 키가 있다면 해당 Map.Entry를 리턴
										//없으면 주어진 키 바로 위의 Map.Entry를 리턴
		System.out.println("85점 이거나 바로 우의 점수 : " + entry.getKey() + "-" + entry.getValue());

		System.out.println("-----남은 객체 수 확인------");
		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry(); // pollFirstEntry 오름차순 - pollLastEntry 내림차순
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
		}

	}

}
