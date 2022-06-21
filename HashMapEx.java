package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "È«±æµ¿"), 95);
		map.put(new Student(1, "È«±æµ¿"), 95);

		System.out.println("ÃÑ Entry ¼ö : " + map.size());

	}

}

class Student {
	private int sno;
	private String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));

		} else {
			return false;
		}
	}

	public int hashCode() {
		return sno + name.hashCode();
	}
}
