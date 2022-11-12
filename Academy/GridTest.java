package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridTest {
	private Frame frame;
	private Button b1, b2, b3;
	private TextField tf1, tf2, tf3;

	public GridTest() {
		frame = new Frame("GridLayout example");
		b1 = new Button("button 1");
		b2 = new Button("button 2");
		b3 = new Button("button 3");

		tf1 = new TextField("Input Text 1");
		tf2 = new TextField("Input Text 2");
		tf3 = new TextField("Input Text 3");
	}

	public void startFrame() {
		// 3�� 2��¥�� ��ư�� �����.
		// 3�ٷ� ��ġ�ϸ� ���ʿ� ���� ���� ũ�� �ǹ̰� ��������.
		frame.setLayout(new GridLayout(3, 0));

		frame.add(b1); // 1�� 1��
		frame.add(tf1); // 1�� 2��
		frame.add(b2); // 2�� 1��
		frame.add(tf2); // 2�� 2��
		frame.add(b3); // 3�� 1��
		frame.add(tf3); // 3�� 2��

		frame.pack(); // Frame�� ũ�⸦ ������Ʈ�� ũ�⿡ �°� �����Ѵ�
		frame.setSize(500, 500); // ������ ������ ����
		frame.setVisible(true); // ������ ȭ�� ���̰�
	}

	public static void main(String[] args) {
		GridTest flow = new GridTest();
		flow.startFrame();

	}

}
