package collection_framework;

import java.util.HashSet;
import java.util.Set;

class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class HashSetTest2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));

		System.out.println("�� ��ü �� : " + set.size());

	}
}
