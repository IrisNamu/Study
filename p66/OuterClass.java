package p66;

public class OuterClass {

	private int outVar = 10;
	private static int outStaticVar = 20;

	//이너클래스 구현
	class InnerClass {
		public void printInfo() {
			System.out.println("outVar = " + outVar);
			System.out.println("outStaticVar = " + outStaticVar);

		}
	}
}

//질문
//내부 클래스 프린트 인포 내부에서 외부에 있는 멤버변수 접근이 가능할까? 불가능할까?
//가능하다.

//반대로 아우터클래스에서 이너클래스 접근해서 값 확인하는게 가능할까?
//