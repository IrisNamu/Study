package p40;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest extends WindowAdapter implements ActionListener {
	
	
	// 윈도우 종료
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public TextFieldTest() {
		Frame f = new Frame("Login");
		f.addWindowListener(this);
		f.setSize(400, 75);
		f.setLayout(new FlowLayout()); // 배치관리자 플로우레이아웃으로 설정

		Button b = new Button("Login");
		
		Label lid = new Label("ID : ", Label.RIGHT); // 라벨입력 창은 텍스트 옆 오른쪽으로 배치한다.
		Label Ipwd = new Label("Password : ", Label.RIGHT); // 라벨입력 창은 텍스트 옆 오른쪽으로 배치한다.

		 id = new TextField(10); // 10글자까지 입력 가능한 텍스트 필드
		 pwd = new TextField(10); // 10글자까지 입력 가능한 텍스트 필드
		 pwd.setEchoChar('*'); // 비밀번호 입력하면 ****로 되게하기
		 
		 b.Login = new Button("Login");
		 b.Login = new Button("Login");
		f.add(b);
		f.add(lid);
		f.add(id);
		f.add(Ipwd);
		f.add(pwd);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(id.getText()); //텍스트필드에서 값 읽어와야함
		System.out.println(pwd.getText()); //텍스트필드에서 값 읽어와야함
		
		if(id.getText().equals("")) {
			
		}
	} 

	public static void main(String[] args) {
		new TextFieldTest();

	}

}
