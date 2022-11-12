package p74;

public class AnonymousEx {

	public static void main(String[] args) {
		Anoymous anony = new Anoymous();
		anony.field.wake();
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다."); //5
			}

			void wake() { //4. 
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}
}
