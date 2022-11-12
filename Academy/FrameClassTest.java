package AWT;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameClassTest extends WindowAdapter {

	// X버튼 누르면 종료
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	} // 이벤트 리스너 안달면 실행이 안됨. 꼭 이벤트 리스터 달아주기

	public FrameClassTest() {

		Frame f = new Frame("Login");
		f.setSize(300, 200); // 프레임창 크기
		f.addWindowListener(this);

		Toolkit tk = Toolkit.getDefaultToolkit(); // 구현된 Toolkit객체를 얻는다.
		Dimension screenSize = tk.getScreenSize(); // 화면의 크기를 구한다.

		// 화면의 크기의 절반값에서 Frame크기의 절반 값을 뺀 위치로하면
		// Frame이 모니터 화면 가운데 위치하게된다.
		f.setLocation(screenSize.width / 2 - 150, // 높이 300의 절반
				screenSize.height / 2 - 100); // 넓이 200에 절반

		f.setVisible(true); // 화면에 보이도록
	}

	public static void main(String[] args) {
		new FrameClassTest();

	}
}
