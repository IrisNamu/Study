
public class p46 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		//System.out.println(sb); �̷��� �ᵵ �ڵ����� toString ȣ��ȴ�.

		sb.insert(4, "2");//���ڿ� ����
		System.out.println(sb.toString());

		sb.setCharAt(4, '6'); // // ���� ��ü, ���� ��ü, ���� ġȯ
		System.out.println(sb.toString());

		sb.replace(6, 13, "book"); // // ���ڿ� ġȯ, ���ڿ� ��ü
		System.out.println(sb.toString());

		sb.delete(4, 5); //���ڿ� ����
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("�ѹ��ڼ� : " + length);

		String result = sb.toString();
		System.out.println(result);

	}

}