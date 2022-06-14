package p72;

public class E {
	
	//메서드를 호출하지 않으면 F라는 정체를 알 수 없음
	void method() {
		class F {
			F() {
			}

			int field1; // 인스턴스 필드
//			static int field2 //정적 필드(x)

			void method1() { // 인스턴스 메소드
				System.out.println("class E -method()- class F - method1()");
			}
//			static void method2() {} //정적 메서드(x)			
		}

		F f = new F();
		f.field1 = 7;
		System.out.println("f.field1 : " + f.field1);
		f.method1();
	}

}
