package study;

import java.text.DecimalFormat;

//숫자 형식 클래스 DemicalFormat
public class DecimalFormatTest {
	public static void main(String[] args) {

		// 변환할 값
		double num = 12345.6789;

		// 10진수 - 빈자리는 0으로 채움
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num)); // 출력값 : 12346

		// 10진수 - 빈자리는 0으로 채움
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num)); // 출력값 : 12345.7

		// 10진수 - 빈자리는 0으로 채움
		df = new DecimalFormat("000000.00000");
		System.out.println(df.format(num)); // 출력값 : 012345.67890

		// 10진수 - 빈자리는 채우지 않음
		df = new DecimalFormat("#");
		System.out.println(df.format(num)); // 출력값 : 12346

		// 10진수 - 빈자리는 채우지 않음
		df = new DecimalFormat("######.###");
		System.out.println(df.format(num)); // 출력값 : 12345.679

		// 10진수 - # 0 조합 / 단위구분을 위한 , 추가
		df = new DecimalFormat("#,###.00000");
		System.out.println(df.format(num)); // 출력값 : 12,345.67890

		// 100을 곱한 후 문자에 % 붙임
		df = new DecimalFormat("#.##%");
		System.out.println(df.format(num)); // 출력값 : 1234567.89%

		// 통화표시 \u00A4
		df = new DecimalFormat("\u00A4####.##");
		System.out.println(df.format(num)); // 출력값 : ￦12345.68

	}
}
