package p74;

public class AnonymousEx {

	public static void main(String[] args) {
		Anoymous anony = new Anoymous();
		anony.field.wake();
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�."); //5
			}

			void wake() { //4. 
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}
}
