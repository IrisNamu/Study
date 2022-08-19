import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class B10699 {

	public static void main(String[] args) {
		ZonedDateTime nowSeoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		ZonedDateTime nowBerlin = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
		ZonedDateTime nowChicago = ZonedDateTime.now(ZoneId.of("America/Chicago"));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"YYYY-MM-dd HH:mm:ss");

		System.out.println("nowSeoul: " + nowSeoul.format(formatter));
		System.out.println("nowBerlin: " + nowBerlin.format(formatter));
		System.out.println("nowChicago: " + nowChicago.format(formatter));
	}
}
