import java.util.StringTokenizer;

public class p43 {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		// '/'딜리미터를 이용해서 자름
		StringTokenizer st = new StringTokenizer(text, "/"); 
		
		//countTokens 토큰의 개수를 세고 리턴핟다.
		int countTokens = st.countTokens();
		
		//현재 가리키고 있는 문자열 '홍길동'출력시키고 반복해서 nextToken을 호출
       //이번에는 '이수홍'이라는 스트링타입의 지역변수 호출. nextToken 호출..반복.. 
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken(); //nextToken 다음 토큰을 가리킨다.
			System.out.println(token);
		}
		
		System.out.println();

		st = new StringTokenizer(text, "/"); 
		
		//있으면 T...없으면 F 
		//'/'가 있으면 트루 잘라준다. F면 그냥 출력
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
