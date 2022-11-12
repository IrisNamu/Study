package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//윈도우 어댑터 클래스 상속
//직접구현한거랑 동일한 효과
public class FlowTest3 extends WindowAdapter {
	private Frame f;
	private Button btn1, btn2, btn3;

	public FlowTest3() {
		f = new Frame("adapter example");
		btn1 = new Button("Ok");
		btn2 = new Button("Open");
		btn3 = new Button("Close");
	}

	// 윈도우가 닫히려고 할 때 (X버튼을 누를때)
	public void windowClosing(WindowEvent e) {
		System.exit(0); // 종료 버튼 누르면 종료가 된다.
		// 여기서 0이란 참 트루!!!!!!!!!!
	}

	public void startFrame() {
		f.addWindowListener(this);
		f.setLayout(new FlowLayout());

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.setSize(300, 300); // 창 크기
		f.setLocation(200, 200); // 창 배치 위치
		f.setVisible(true); // 화면에 보이도록 설정
	}

	public static void main(String[] args) {
		FlowTest3 g = new FlowTest3();
		g.startFrame();

	}

}
