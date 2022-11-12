package collection_framework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class HashTableEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();

		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		//descendingSet 내림차순으로 정렬
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		// ascendingSet 오름차순 정렬
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for (Integer score : ascendingSet) {
			System.out.print(score + " ");
		}

	}

}
