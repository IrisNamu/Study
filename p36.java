
public class p36 {

	public static void main(String[] args) {
		String ssn = "870913-1234567";

		// 0,6 -> 인덱스 0번부터 6번 인덱스전까지 부분문자열로 만들어서 추출!
		String firstNum = ssn.substring(0, 6);

		// 인덱스 7번부터 끝까지 부분문자열로 추출한다.
		String secondNum = ssn.substring(7);

		System.out.println("firstNum : " + firstNum);
		System.out.println("secondNum : " + secondNum);

	}

}
