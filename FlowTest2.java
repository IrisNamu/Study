package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//윈도우 이벤트 클래스
public class FlowTest2 implements WindowListener {
	private Frame f;
	private Button btn1, btn2, btn3;

	public FlowTest2() {
		f = new Frame("adapter example");
		btn1 = new Button("Ok");
		btn2 = new Button("Open");
		btn3 = new Button("Close");
	}

	// 윈도우가 닫히려고 할 때 (X버튼을 누를때)
	public void windowClosing(WindowEvent e) {
		System.exit(0); // 종료 버튼 누르면 종료가 된다.
	}

	// 윈도우가 닫혔을 때
	public void windowClosed(WindowEvent e) {
	}

	// 윈도우가 활성화 될 때
	public void windowActivated(WindowEvent e) {
	}

	// 윈도우 비활성화될 때
	public void windowDeactivated(WindowEvent e) {
	}

	// 윈도우 정상화 되었을 떄
	public void windowDeiconified(WindowEvent e) {
	}

	// 윈도우가 아이콘화 되었을 때
	public void windowIconified(WindowEvent e) {
	}

	// 윈도우가 화면에 처음 나타날 때
	public void windowOpened(WindowEvent e) {
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
		FlowTest2 g = new FlowTest2();
		g.startFrame();

	}

}
