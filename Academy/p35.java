
public class p35 {

	public static void main(String[] args) {
		String oldStr = "Java�� ���� ū Ư¡�� �÷����� �������̶�� ���Դϴ�.\n" + "�ҽ��ڵ带 ����� �������Ͽ� ��ũ�ϴ� C/C++��, ���� �����ٴ� ������ ������,\n"
				+ " '�̽ļ��� ����'��� ������ ��������. Java�� �̿� �ٸ��� ����Ʈ�ڵ���\n"
				+ "Ŭ���� ����(c.class)�� �����ϰ�, �� ������ ������ ���ķ������� Java ���� �ӽ�(JVM)��\n"
				+ "�ؼ��ؼ� �����մϴ�. �� Ư������ ���� Java�� �»����� ���� ������\n" + "�ɰ��� ������ ��� ������ �Ǿ���.\r\n";

		System.out.println("oldStr : " + oldStr);

		String newStr = oldStr.replace("Java", "�ڹ�");

		System.out.println("newStr : " + newStr);
	}

}
