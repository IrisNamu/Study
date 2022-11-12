package p32;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	public boolean roll() {
		++accumnlatedRotation;
		if (accumnlatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ¼ö¸í : "
		+ (maxRotation - accumnlatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ÆãÅ© ***");
			return false;
		}

	}
}
