package buttonTextChange;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JButton;

public class ButtonTest3 extends WindowAdapter implements MouseListener {
	JButton b;

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public ButtonTest3() {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		f.addWindowListener(this);
		b = new JButton("확인");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addMouseListener(this);

		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (b.getText().equals("확인")) {
			b.setText("취소");
		} else if (b.getText().equals("취소")) {
			b.setText("확인");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		b.setBackground(Color.CYAN);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	public static void main(String[] args) {
		new ButtonTest3();
	}
}