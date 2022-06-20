
public class p46 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		//System.out.println(sb); 이렇게 써도 자동으로 toString 호출된다.

		sb.insert(4, "2");//문자열 삽입
		System.out.println(sb.toString());

		sb.setCharAt(4, '6'); // // 문자 대체, 문자 교체, 문자 치환
		System.out.println(sb.toString());

		sb.replace(6, 13, "book"); // // 문자열 치환, 문자열 교체
		System.out.println(sb.toString());

		sb.delete(4, 5); //문자열 삭제
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("총문자수 : " + length);

		String result = sb.toString();
		System.out.println(result);

	}

}
