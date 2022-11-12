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
		// 3행 2열짜리 버튼을 만든다.
		// 3줄로 배치하면 뒤쪽에 대한 열은 크게 의미가 없어진다.
		frame.setLayout(new GridLayout(3, 0));

		frame.add(b1); // 1행 1열
		frame.add(tf1); // 1행 2열
		frame.add(b2); // 2행 1열
		frame.add(tf2); // 2행 2열
		frame.add(b3); // 3행 1열
		frame.add(tf3); // 3행 2열

		frame.pack(); // Frame의 크기를 컴포넌트의 크기에 맞게 조정한다
		frame.setSize(500, 500); // 프레임 사이즈 지정
		frame.setVisible(true); // 프레임 화면 보이게
	}

	public static void main(String[] args) {
		GridTest flow = new GridTest();
		flow.startFrame();

	}

}
