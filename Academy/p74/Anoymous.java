package p74;

public class Anoymous {
	//�ν��Ͻ� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		// 1. wake�޼��� ȣ�� - 6�ÿ� �Ͼ�ϴ�.
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
		}
	};

	void method1() {
		Person localVar = new Person() {
			void walk() { // 3
				System.out.println("��å�մϴ�.");
			}

			void wake() { //2
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}

}
