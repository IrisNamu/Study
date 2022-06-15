package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEvent2 {
	private Frame f;
	private Button btn1, btn2, btn3, btn4, btn5;

	public AWTEvent2() {
		f = new Frame("event handler example"); // 프레임 타이플
		// 5개의 버튼 생성
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	// Event Handler Class를 익명의 클래스로 사용
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

		// 컴포넌트를 프레임 추가할때 레이아웃의 우치를 설정
		f.add(btn1, "North");
		f.add(btn2, "South");
		f.add(btn3, "West");
		f.add(btn4, "East");
		f.add(btn5, "Center");

		f.setSize(300, 300); // 프레임 사이즈 지정
		f.setVisible(true); // 프레임이 화면에 보이도록

	}

	public static void main(String[] args) {
		AWTEvent2 border = new AWTEvent2();
		border.startFrame();
	}

}
