package AWT;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameClassTest extends WindowAdapter {

	// X��ư ������ ����
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	} // �̺�Ʈ ������ �ȴ޸� ������ �ȵ�. �� �̺�Ʈ ������ �޾��ֱ�

	public FrameClassTest() {

		Frame f = new Frame("Login");
		f.setSize(300, 200); // ������â ũ��
		f.addWindowListener(this);

		Toolkit tk = Toolkit.getDefaultToolkit(); // ������ Toolkit��ü�� ��´�.
		Dimension screenSize = tk.getScreenSize(); // ȭ���� ũ�⸦ ���Ѵ�.

		// ȭ���� ũ���� ���ݰ����� Frameũ���� ���� ���� �� ��ġ���ϸ�
		// Frame�� ����� ȭ�� ��� ��ġ�ϰԵȴ�.
		f.setLocation(screenSize.width / 2 - 150, // ���� 300�� ����
				screenSize.height / 2 - 100); // ���� 200�� ����

		f.setVisible(true); // ȭ�鿡 ���̵���
	}

	public static void main(String[] args) {
		new FrameClassTest();

	}
}
