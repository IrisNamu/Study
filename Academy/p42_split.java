
public class p42_split {
	public static void main(String[] args) {
		String text = "È«±æµ¿&ÀÌ¼öÈ«,¹Ú¿¬¼ö,±èÀÚ¹Ù-simon";

		String[] names = text.split("&|,");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
