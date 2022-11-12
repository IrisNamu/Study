
public class p54 {

	public static void main(String[] args) {
		// Boxing
		Integer obj1 = 100;
		Integer obj2 = new Integer("200");//추천하지 않는다.
		Integer obj3 = Integer.valueOf("300");

		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
