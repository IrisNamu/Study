package p21_1;

public class B {
	public void method() {
		A a = new A();
		a.field = "value"; //직접적으로 접근. 필드앞에 protected라고 함
		a.method();
	}
}
