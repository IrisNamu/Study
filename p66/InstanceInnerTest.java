package p66;

public class InstanceInnerTest {

	public static void main(String[] args) {
		//�ƿ��� Ŭ������ �ν��Ͻ� ����
		OuterClass oc = new OuterClass();
		
		//����Ʈ ������ �ٷ� ���� �� ����. 
		// �̷��� ����߸� in�� �̿��� ȣ�Ⱑ��
		OuterClass.InnerClass in = oc.new InnerClass();

		in.printInfo();
		
	}

}
