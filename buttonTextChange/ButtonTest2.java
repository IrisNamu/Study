package buttonTextChange;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class ButtonTest2 extends WindowAdapter implements ActionListener {
	private Button b;
	private int status;

	public ButtonTest2() {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);

		b = new Button("Ȯ��");
		status = 1;
		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addActionListener(this);

		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 1 : Ȯ��, 2 : ���
		if (status == 1) {
			b.setLabel("���");
			status = 2;
		} else {
			b.setLabel("Ȯ��");
			status = 1;
		}
	}

	public static void main(String[] args) {
		new ButtonTest2();
	}
}