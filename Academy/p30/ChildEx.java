package p30;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
//		parent.method3();  //ȣ�� �Ұ��� ��? �̰� �ڽĿ� �ͼ� �߰��� ���
		
		child.method1(); //�θ�κ��� ��ӹ޾����Ƿ� Parent method1()�� ���
		child.method2();
		child.method3();
		
		System.out.println("--------------");
		
		parent = child;
		parent.method1(); //Parent method1()
		parent.method2(); //Child method2()	

	}

}
