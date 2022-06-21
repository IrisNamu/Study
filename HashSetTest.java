package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servle/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("ÃÑ °´Ã¼¼ö : " + set.size());

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("ºñ¾îÀÖÀ½");
		}

	}

}
