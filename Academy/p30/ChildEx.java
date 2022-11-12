package p30;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
//		parent.method3();  //호출 불가능 왜? 이건 자식에 와서 추가된 기능
		
		child.method1(); //부모로부터 상속받았으므로 Parent method1()이 출력
		child.method2();
		child.method3();
		
		System.out.println("--------------");
		
		parent = child;
		parent.method1(); //Parent method1()
		parent.method2(); //Child method2()	

	}

}
