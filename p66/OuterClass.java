package p66;

public class OuterClass {

	private int outVar = 10;
	private static int outStaticVar = 20;

	//�̳�Ŭ���� ����
	class InnerClass {
		public void printInfo() {
			System.out.println("outVar = " + outVar);
			System.out.println("outStaticVar = " + outStaticVar);

		}
	}
}

//����
//���� Ŭ���� ����Ʈ ���� ���ο��� �ܺο� �ִ� ������� ������ �����ұ�? �Ұ����ұ�?
//�����ϴ�.

//�ݴ�� �ƿ���Ŭ�������� �̳�Ŭ���� �����ؼ� �� Ȯ���ϴ°� �����ұ�?
//