package p42;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaTest {

	public static void main(String[] args) {
		Frame f = new Frame("Comments");
		f.setSize(400, 220);
		f.setLayout(new FlowLayout());

		TextArea commnets = new TextArea("�ϰ� ���� ���� ��������!", 10, 50);

		f.add(commnets);
		commnets.selectAll(); //TextArea�� ��� text�� ���õǰ� �Ѵ�.
		f.setVisible(true);
	}

}
