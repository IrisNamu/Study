package study;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now)); // Console : 2022-06-21
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now)); // Console :2022년 06월 21일
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now)); // Console : 2022.06.21 오전 10:55:21
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now)); // Console : 오늘은 화요일
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now)); // Console : 올해의 172번째 날
		
		sdf = new SimpleDateFormat("이 달의 d번째 날");
		System.out.println(sdf.format(now)); // Console : 이 달의 21번째 날
		

	}

}
