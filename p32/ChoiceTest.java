package p32;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest {
	public static void main(String[] args) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300, 200); // ������ ������ ����
		f.setLayout(null); // �����ƿ� ���� ����.

		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");

		day.setSize(100, 50); // ���̽� ������ ����
		day.setLocation(100, 70); // ���̽� ��ġ

		f.add(day); // �����ӿ� ����
		f.setVisible(true);
	}

}
