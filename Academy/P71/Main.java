package P71;

public class Main {

	public static void main(String[] args) {
		C.D c = new C.D();
		c.field1 = 4;
		c.method1();
		System.out.println("c.field1 : " + c.field1);

		C.D.field2 = 3;
		System.out.println("c.field2 : " + C.D.field2);
		C.D.method2();

	}

}
