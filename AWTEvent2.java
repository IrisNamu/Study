package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEvent2 {
	private Frame f;
	private Button btn1, btn2, btn3, btn4, btn5;

	public AWTEvent2() {
		f = new Frame("event handler example"); // ������ Ÿ����
		// 5���� ��ư ����
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	// Event Handler Class�� �͸��� Ŭ������ ���
	public void startFrame() {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 1 Click!");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 2 Click!");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 3 Click!");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 4 Click!");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 5 Click!");
			}
		});

		// ������Ʈ�� ������ �߰��Ҷ� ���̾ƿ��� ��ġ�� ����
		f.add(btn1, "North");
		f.add(btn2, "South");
		f.add(btn3, "West");
		f.add(btn4, "East");
		f.add(btn5, "Center");

		f.setSize(300, 300); // ������ ������ ����
		f.setVisible(true); // �������� ȭ�鿡 ���̵���

	}

	public static void main(String[] args) {
		AWTEvent2 border = new AWTEvent2();
		border.startFrame();
	}

}
