package p74;

public class Anoymous {
	//인스턴스 생성
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		// 1. wake메서드 호출 - 6시에 일어납니다.
		void wake() {
			System.out.println("6시에 일어납니다.");
		}
	};

	void method1() {
		Person localVar = new Person() {
			void walk() { // 3
				System.out.println("산책합니다.");
			}

			void wake() { //2
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}

}
