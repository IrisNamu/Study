package AWT;

import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		Frame f = new Frame("Frame Demo");// 프레임에 타이틀 설정
		f.setSize(300, 200); //크기지정
		f.setVisible(true); // 반드시 true로 해줘야 화면에 나타남

	}

}
