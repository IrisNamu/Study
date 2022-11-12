package collection_framework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class HashTableEx2 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("1");
		treeSet.add("2");
		treeSet.add("3");
		treeSet.add("4");
		treeSet.add("5");
		treeSet.add("6");
		treeSet.add("7");
		treeSet.add("8");

		System.out.println("[2-6 사이의 숫자 검색]");

		NavigableSet<String> rangeSet = treeSet.subSet("2", true, "6", true);
		for (String word : rangeSet) {
			System.out.print(word + " ");
		}
	}

}
