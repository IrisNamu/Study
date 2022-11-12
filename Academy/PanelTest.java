package AWT;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTest {
	private JFrame f; // 프레임
	private JPanel p; // 패널
	private JButton ok, cancel; // 버튼 두개 생성
	private JTextField tf1; // 텍스트 넣을 수 있는 공간

	public PanelTest() {
		f = new JFrame("panel example"); // 프레임 타이틀 달기
		ok = new JButton("전송");
		cancel = new JButton("삭제");
		tf1 = new JTextField("Input..."); // 텍스트필드에 미리 적어놓음
		p = new JPanel();
	}

	public void startFrame() {
		f.add(tf1, BorderLayout.NORTH); // 텍스트필드 상단에 위치하도록
		p.setBackground(Color.green); // 패널 색 그린으로
		p.add(ok); // 패널에 전송 버튼 부착
		p.add(cancel); // 패널에 삭제 버튼 부착
		f.add(p, BorderLayout.CENTER); // 패널은 가운데에 위치하도록

		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		PanelTest g = new PanelTest();
		g.startFrame();

	}

}
