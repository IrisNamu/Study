package p66;

public class InstanceInnerTest {

	public static void main(String[] args) {
		//아우터 클래스의 인스턴스 생성
		OuterClass oc = new OuterClass();
		
		//프린트 인포는 바로 받을 수 없다. 
		// 이렇게 해줘야만 in을 이용해 호출가능
		OuterClass.InnerClass in = oc.new InnerClass();

		in.printInfo();
		
	}

}
