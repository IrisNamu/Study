package p43;

import p30.Child;
import p30.Parent;

public class Main {
	public static void main(String[] args) {
		Parent parent = new Parent(); // 같은타입
		Child child = new Child();

		if (parent instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (parent instanceof Child) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (child instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (child instanceof Child) { // 같은타입
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
