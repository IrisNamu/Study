package Login;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextFieldTest implements ActionListener {
	private MemberDao dao;
	private Button bLogin;
	private TextField tfMsg;
	private TextField id, pwd;
	private final String correct_id = "green";
	private final String correct_pwd = "gr1234";

	public TextFieldTest() {
		
		dao = new MemberDao();
		Frame f = new Frame("Login");
		f.setSize(400, 120);
		f.setLayout(new FlowLayout());

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
		new TextFieldTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (id.getText().equals("")) {
			tfMsg.setText("ID를 입력하세요.");
		} else if (pwd.getText().equals("")) {
			tfMsg.setText("Password를 입력하세요.");
		} else {
			System.out.println(id.getText());
			System.out.println(pwd.getText());

			MemberVo vo = new MemberVo(id.getText(), pwd.getText());
			boolean b = dao.list(vo);
			tfMsg.setText(String.valueOf(b));
		}
	}
}
