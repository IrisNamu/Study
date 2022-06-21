package collection_framework;

import java.util.Map;
import java.util.TreeMap;

public class HashTableEx3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put((87), "�� ��");
		scores.put((98), "����");
		scores.put((75), "�Ǽ���");
		scores.put((95), "�̵���");
		scores.put((80), "���ڹ�");

		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry(); // ���� ���� Map.Entry�� ����
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.lastEntry(); // ���� ���� Map.Entry�� ����
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.lowerEntry(95); //�־��� Ű���� �ٷ� �Ʒ� Map.Entry�� ����
		System.out.println("95�� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.higherEntry(95); //�־��� Ű���� �ٷ� �� Map.Entry�� ����
		System.out.println("95�� ���� ���� : " + entry.getKey() + "-" + entry.getValue() + "\n");

		entry = scores.floorEntry(95); //�־��� Ű�� ������ Ű�� �ִٸ� �ش� Map.Entry�� ����
										//������ �־��� Ű �ٷ� �Ʒ��� Map.Entry�� ����
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());

		entry = scores.ceilingEntry(85); //�־��� Ű�� ������ Ű�� �ִٸ� �ش� Map.Entry�� ����
										//������ �־��� Ű �ٷ� ���� Map.Entry�� ����
		System.out.println("85�� �̰ų� �ٷ� ���� ���� : " + entry.getKey() + "-" + entry.getValue());

		System.out.println("-----���� ��ü �� Ȯ��------");
		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry(); // pollFirstEntry �������� - pollLastEntry ��������
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(���� ��ü ��: " + scores.size() + ")");
		}

	}

}
