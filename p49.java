import java.util.Arrays;

public class p49 {

	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);

		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));

		//copyOfRange(원본배열, 시작인덱스, 끝인덱스)
		//원본 배열의 시작 인덱스에서 끝 인덱스까지 복사한 배열
		////특정범위를 지정해서 해당부분만 복사할 수 있다.
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));

		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}

	}

}
