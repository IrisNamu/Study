package AWT;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTest {
	private JFrame f; // ������
	private JPanel p; // �г�
	private JButton ok, cancel; // ��ư �ΰ� ����
	private JTextField tf1; // �ؽ�Ʈ ���� �� �ִ� ����

	public PanelTest() {
		f = new JFrame("panel example"); // ������ Ÿ��Ʋ �ޱ�
		ok = new JButton("����");
		cancel = new JButton("����");
		tf1 = new JTextField("Input..."); // �ؽ�Ʈ�ʵ忡 �̸� �������
		p = new JPanel();
	}

	public void startFrame() {
		f.add(tf1, BorderLayout.NORTH); // �ؽ�Ʈ�ʵ� ��ܿ� ��ġ�ϵ���
		p.setBackground(Color.green); // �г� �� �׸�����
		p.add(ok); // �гο� ���� ��ư ����
		p.add(cancel); // �гο� ���� ��ư ����
		f.add(p, BorderLayout.CENTER); // �г��� ����� ��ġ�ϵ���

		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		PanelTest g = new PanelTest();
		g.startFrame();

	}

}
