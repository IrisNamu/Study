package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//������ ����� Ŭ���� ���
//���������ѰŶ� ������ ȿ��
public class FlowTest3 extends WindowAdapter {
	private Frame f;
	private Button btn1, btn2, btn3;

	public FlowTest3() {
		f = new Frame("adapter example");
		btn1 = new Button("Ok");
		btn2 = new Button("Open");
		btn3 = new Button("Close");
	}

	// �����찡 �������� �� �� (X��ư�� ������)
	public void windowClosing(WindowEvent e) {
		System.exit(0); // ���� ��ư ������ ���ᰡ �ȴ�.
		// ���⼭ 0�̶� �� Ʈ��!!!!!!!!!!
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
		FlowTest3 g = new FlowTest3();
		g.startFrame();

	}

}
