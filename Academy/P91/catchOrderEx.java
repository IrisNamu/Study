package P91;

public class catchOrderEx {
	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);

		} catch (Exception e) { //최상위 예외 클래스
			System.out.println("실행에 문제가 있습니다.");
		} catch (ArrayIndexOutOfBoundsException e) { //하위개념
			System.out.println("실행 매개값의 수가 부족합니다.");
		} finally {
			System.out.println("다시실행하세요.");
		}
	}
}
