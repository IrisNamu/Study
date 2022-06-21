package collection_framework;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		Integer score = null;

		// ���� ���� ���� ��ü ����
		score = scores.first();
		System.out.println("���� ���� ���� : " + score); //75

		// ���� ���� ���� ��ü ����
		score = scores.last();
		System.out.println("���� ���� ���� : " + score); //98

		score = scores.lower(95);
		System.out.println("95�� �Ʒ� ���� : " + score); // 87

		score = scores.higher(95);
		System.out.println("95�� �Ʒ� ���� : " + score); //98

		score = scores.floor(95);
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ���� : " + score); //95

		score = scores.ceiling(85);
		System.out.println("85�� �̰ų� �ٷ� ���� ���� : " + score); //87

		while (!scores.isEmpty()) {
			score = scores.pollFirst();// ���� ���� �� ������ ����. ��������
			System.out.println(score + "���� ��ü ��: " + scores.size() + ")");
		} 
/*		75���� ��ü ��: 4)
		80���� ��ü ��: 3)
		87���� ��ü ��: 2)
		95���� ��ü ��: 1)
		98���� ��ü ��: 0)
*/

	}

}
