package p6_19;

import java.awt.Button;
import java.awt.Frame;

public class ActionTest {
	private Frame f;
	private Button btn1, btn2, btn3, btn4, btn5;

	public ActionTest() {
		f = new Frame("event handler example"); // ������ Ÿ����
		// 5���� ��ư ����
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	public void startFrame() {
		// ActionListener (��ư ������ ������ �����ϱ� ���� �޼ҵ�)
		// ��ư�� Ŭ���ϸ� �� �޼ҵ尡 �����̵ǵ��� ����
		// �� ��ư�� ������ �ܼ�â�� ����� �ȴ�.
		btn1.addActionListener(new ActionHandler());
		btn2.addActionListener(new ActionHandler());
		btn3.addActionListener(new ActionHandler());
		btn4.addActionListener(new ActionHandler());
		btn5.addActionListener(new ActionHandler());

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
		ActionTest border = new ActionTest();
		border.startFrame();
	}

}
