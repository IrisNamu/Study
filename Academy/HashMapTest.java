package collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		   // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 객체 저장
        // key값이 1번과 4번이 동일하기 때문에 value는 4번의 value가 들어가게 된다.
        /** 1번 */ map.put("가", 85);
        /** 2번 */ map.put("나", 90);
        /** 3번 */ map.put("다", 80);
        /** 4번 */ map.put("가", 95);

        // map에 저장된 총 Entry 수 얻기
        System.out.println("총 Entry 수 : " + map.size());

        // 객체 찾기
        // key로 value 찾기
        System.out.println("\t가 : " + map.get("가"));
        System.out.println();

        // 객체를 하나씩 처리하기
        // Key Set 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // 객체 삭제
        // map의 Entry 제거하기 :: key 이용
        map.remove("가");
        // 객체 삭제 후 map 확인하기
        System.out.println("총 Entry 수 : " + map.toString());
        // 객체 삭제 후 map의 size 확인하기
        System.out.println("총 Entry 수 : " + map.size());

        // 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        // 반복해서 Map.Entry 얻고 키와 값을 얻어냄
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        // 객체 전체 삭제
        // 모든 Map의 Entry 삭제하기
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}