package buttonTextChange;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest implements ActionListener {
	private Button b;

	public ButtonTest() {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);

		b = new Button("Ȯ��");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addActionListener(this);

		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("���"); //�̷��� �ܼ�â���� ��Ұ� ��
		if (b.getLabel().equals("Ȯ��")) {
			b.setLabel("���");
		} else if (b.getLabel().equals("���")) {
			b.setLabel("Ȯ��");
		}
	}

	public static void main(String[] args) {
		new ButtonTest();
	}
}