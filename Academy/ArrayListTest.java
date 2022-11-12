package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		//마치 배열처럼 리스트 내부에 추가 된다.
		list.add("Java"); //맨 끝에 객체 추가
		list.add("JDBC"); //맨 끝에 객체 추가
		list.add("Servlet/JSP");  //맨 끝에 객체 추가
		list.add(2, "Database");  //저장된 인덱스에 객체 삽입
		list.add("iBATIS");  //맨 끝에 객체 추가

		int size = list.size();
		System.out.println("총 객체 수 : " + size);

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println(); //한 줄 띄기

		//list를 반복하며 객체를 꺼내서 출력
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println(); //한 줄 띄기

		list.remove(2); //인덱스로 객체삭제. 2 : Database가 삭제된다.
		list.remove("iBATIS");// 객체 삭제. 4 : iBATIS가 삭제된다.
		list.remove(2); //뒤쪽에 있는 아이템들 다시 앞쪽으로 하나씩 차곡차곡 떙겨짐
		//그럼 기존  2 : Database가 아니라 2 : Servlet/JSP가 삭제된다.

		//list를 반복하며 객체를 꺼내서 출력
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

	}
}