package AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderTest {

	// 멤버변수 6개
	private Frame frame;
	private Button center, west, east, south;
	private TextField tf1;

	// 메서드 3개
	public BorderTest() {
		frame = new Frame("BorderLatout example");
		south = new Button("button 1");
		west = new Button("button 2");
		east = new Button("button 3");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("입력창입니다.");
	}

	public void startFrame() {
		frame.add(tf1, BorderLayout.NORTH); 
		frame.add(south, BorderLayout.SOUTH);
		frame.add(west, BorderLayout.WEST);
		frame.add(east, BorderLayout.EAST);
		frame.add(center, BorderLayout.EAST);

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

//메인메서드 수행
	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFrame();
	}
}
