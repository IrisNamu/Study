package collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person arg0) { //compareTo �������̵�(���̸� ��������)
		// TODO Auto-generated method stub
		if (age > arg0.age)
			return -1;
		else if (age == arg0.age)
			return 0;
		else {
			return 1;

		}
	}
}

public class ComparableEx {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();

		treeSet.add(new Person("�̵���", 26));
		treeSet.add(new Person("���ڹ�", 24));
		treeSet.add(new Person("������", 23));

		Iterator<Person> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}

	}

}
