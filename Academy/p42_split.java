
public class p42_split {
	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-simon";

		String[] names = text.split("&|,");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
