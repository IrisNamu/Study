
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest2 extends WindowAdapter implements ActionListener {
	private Button bLogin;
	private TextField tfMsg;
	private TextField id, pwd;
	private final String correct_id = "green";
	private final String correct_pwd = "gr1234";

	// 윈도우 종료
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public TextFieldTest2() {
		Frame f = new Frame("Login");
		f.setSize(400, 120);
		f.setLayout(new FlowLayout());
		f.addWindowListener(this);

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		id = new TextField(10);
		pwd = new TextField(10);
		pwd.setEchoChar('*');

		bLogin = new Button("Login");
		bLogin.addActionListener(this);
		tfMsg = new TextField(40);
		tfMsg.setEditable(false);
		tfMsg.setFocusable(false);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(bLogin);
		f.add(tfMsg);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldTest2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (id.getText().equals("")) {
			tfMsg.setText("ID를 입력하세요.");
		} else if (pwd.getText().equals("")) {
			tfMsg.setText("Password를 입력하세요.");
		} else if (id.getText().equals(correct_id) && pwd.getText().equals(correct_pwd)) {
			tfMsg.setText("로그인이 되었습니다.");
		} else {
			tfMsg.setText("ID/Password를 다시 입력하세요.");
		}
	}
}
