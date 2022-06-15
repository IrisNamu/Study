package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//������ �̺�Ʈ Ŭ����
public class FlowTest2 implements WindowListener {
	private Frame f;
	private Button btn1, btn2, btn3;

	public FlowTest2() {
		f = new Frame("adapter example");
		btn1 = new Button("Ok");
		btn2 = new Button("Open");
		btn3 = new Button("Close");
	}

	// �����찡 �������� �� �� (X��ư�� ������)
	public void windowClosing(WindowEvent e) {
		System.exit(0); // ���� ��ư ������ ���ᰡ �ȴ�.
	}

	// �����찡 ������ ��
	public void windowClosed(WindowEvent e) {
	}

	// �����찡 Ȱ��ȭ �� ��
	public void windowActivated(WindowEvent e) {
	}

	// ������ ��Ȱ��ȭ�� ��
	public void windowDeactivated(WindowEvent e) {
	}

	// ������ ����ȭ �Ǿ��� ��
	public void windowDeiconified(WindowEvent e) {
	}

	// �����찡 ������ȭ �Ǿ��� ��
	public void windowIconified(WindowEvent e) {
	}

	// �����찡 ȭ�鿡 ó�� ��Ÿ�� ��
	public void windowOpened(WindowEvent e) {
	}

	public void startFrame() {
		f.addWindowListener(this);
		f.setLayout(new FlowLayout());

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.setSize(300, 300); // â ũ��
		f.setLocation(200, 200); // â ��ġ ��ġ
		f.setVisible(true); // ȭ�鿡 ���̵��� ����
	}

	public static void main(String[] args) {
		FlowTest2 g = new FlowTest2();
		g.startFrame();

	}

}
