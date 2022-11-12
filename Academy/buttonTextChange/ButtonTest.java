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

		b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addActionListener(this);

		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("취소"); //이러면 콘솔창에만 취소가 뜸
		if (b.getLabel().equals("확인")) {
			b.setLabel("취소");
		} else if (b.getLabel().equals("취소")) {
			b.setLabel("확인");
		}
	}

	public static void main(String[] args) {
		new ButtonTest();
	}
}