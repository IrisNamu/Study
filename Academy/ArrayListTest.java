package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		//��ġ �迭ó�� ����Ʈ ���ο� �߰� �ȴ�.
		list.add("Java"); //�� ���� ��ü �߰�
		list.add("JDBC"); //�� ���� ��ü �߰�
		list.add("Servlet/JSP");  //�� ���� ��ü �߰�
		list.add(2, "Database");  //����� �ε����� ��ü ����
		list.add("iBATIS");  //�� ���� ��ü �߰�

		int size = list.size();
		System.out.println("�� ��ü �� : " + size);

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println(); //�� �� ���

		//list�� �ݺ��ϸ� ��ü�� ������ ���
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println(); //�� �� ���

		list.remove(2); //�ε����� ��ü����. 2 : Database�� �����ȴ�.
		list.remove("iBATIS");// ��ü ����. 4 : iBATIS�� �����ȴ�.
		list.remove(2); //���ʿ� �ִ� �����۵� �ٽ� �������� �ϳ��� �������� ������
		//�׷� ����  2 : Database�� �ƴ϶� 2 : Servlet/JSP�� �����ȴ�.

		//list�� �ݺ��ϸ� ��ü�� ������ ���
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

	}
}