
public class p33 {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로"); // 처음시작하는 인덱스를 찾아주는 것.
		System.out.println("location : " + location);

		if (subject.indexOf("자바") != -1) { // 만약 찾는 문자열이 없다면 리턴값이 -1이다.
			System.out.println("자바와 관련이 있습니다.");
		} else {
			System.out.println("자바와 관련이 없습니다.");
		}
	}

}
