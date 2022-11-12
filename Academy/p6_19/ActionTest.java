package p6_19;

import java.awt.Button;
import java.awt.Frame;

public class ActionTest {
	private Frame f;
	private Button btn1, btn2, btn3, btn4, btn5;

	public ActionTest() {
		f = new Frame("event handler example"); // 프레임 타이플
		// 5개의 버튼 생성
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	public void startFrame() {
		// ActionListener (버튼 누르면 동작을 실행하기 위한 메소드)
		// 버튼이 클릭하면 이 메소드가 동작이되도록 연결
		// 이 버튼을 누르면 콘솔창에 출력이 된다.
		btn1.addActionListener(new ActionHandler());
		btn2.addActionListener(new ActionHandler());
		btn3.addActionListener(new ActionHandler());
		btn4.addActionListener(new ActionHandler());
		btn5.addActionListener(new ActionHandler());

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
		ActionTest border = new ActionTest();
		border.startFrame();
	}

}
