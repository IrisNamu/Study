package p21_1;

public class B {
	public void method() {
		A a = new A();
		a.field = "value"; //���������� ����. �ʵ�տ� protected��� ��
		a.method();
	}
}
