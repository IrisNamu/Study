package collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		   // Map �÷��� ����
        Map<String, Integer> map = new HashMap<String, Integer>();

        // ��ü ����
        // key���� 1���� 4���� �����ϱ� ������ value�� 4���� value�� ���� �ȴ�.
        /** 1�� */ map.put("��", 85);
        /** 2�� */ map.put("��", 90);
        /** 3�� */ map.put("��", 80);
        /** 4�� */ map.put("��", 95);

        // map�� ����� �� Entry �� ���
        System.out.println("�� Entry �� : " + map.size());

        // ��ü ã��
        // key�� value ã��
        System.out.println("\t�� : " + map.get("��"));
        System.out.println();

        // ��ü�� �ϳ��� ó���ϱ�
        // Key Set ���
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // ��ü ����
        // map�� Entry �����ϱ� :: key �̿�
        map.remove("��");
        // ��ü ���� �� map Ȯ���ϱ�
        System.out.println("�� Entry �� : " + map.toString());
        // ��ü ���� �� map�� size Ȯ���ϱ�
        System.out.println("�� Entry �� : " + map.size());

        // ��ü�� �ϳ��� ó��
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        // �ݺ��ؼ� Map.Entry ��� Ű�� ���� ��
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // ��ü ��ü ����
        // ��� Map�� Entry �����ϱ�
        map.clear();
        System.out.println("�� Entry �� : " + map.size());
    }
}