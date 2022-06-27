import java.util.Scanner;

class Person_2 {
	private String name;
	private int height;

	Person_2(String name, int height) {
		this.name = name;
		this.height = height;

	}

	public void print() {
		System.out.println(name + " " + height);
	}

	public int getHeight() {
		return height;
	}

}

public class J617 {
	public static void main(String[] args) {
		Person_2[] p = new Person_2[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < p.length; i++) {

			String name = sc.next();
			int height = sc.nextInt();
			p[i] = new Person_2(name, height);
		}
		sc.close();

		Person_2 smallest = new Person_2("smallest", 200);
		for (int i = 0; i < p.length; i++) {
			if (smallest.getHeight() > p[i].getHeight())
				;
			smallest = p[i];
		}

		smallest.print();
	}
}
