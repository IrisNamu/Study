package buttonTextChange;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest4 extends WindowAdapter implements ActionListener {
	private Button b;
	private int status;

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public ButtonTest4() {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		f.addWindowListener(this);

		b = new Button("확인");
		status = 1;
		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addActionListener(this);

		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 1 : 확인, 2 : 취소
		if (status == 1) {
			b.setLabel("취소");
			status = 2;
		} else {
			b.setLabel("확인");
			status = 1;
		}
	}

	public static void main(String[] args) {
		new ButtonTest4();
	}
}