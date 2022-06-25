package Q1_Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

		Person who = new Person(name, school, grade);

		System.out.println("Name :" + who.getName());
		System.out.println("School :" +who.getSchool());
		System.out.println("Grade :" +who.getGrade());

	}

}
