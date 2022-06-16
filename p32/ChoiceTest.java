package p32;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest {
	public static void main(String[] args) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300, 200); // 프레임 사이즈 설정
		f.setLayout(null); // 레리아웃 직접 지정.

		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");

		day.setSize(100, 50); // 초이스 사이즈 설정
		day.setLocation(100, 70); // 초이스 위치

		f.add(day); // 프레임에 부착
		f.setVisible(true);
	}

}
