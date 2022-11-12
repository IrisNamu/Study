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
	
	
	// ������ ����
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public TextFieldTest() {
		Frame f = new Frame("Login");
		f.addWindowListener(this);
		f.setSize(400, 75);
		f.setLayout(new FlowLayout()); // ��ġ������ �÷ο췹�̾ƿ����� ����

		Button b = new Button("Login");
		
		Label lid = new Label("ID : ", Label.RIGHT); // ���Է� â�� �ؽ�Ʈ �� ���������� ��ġ�Ѵ�.
		Label Ipwd = new Label("Password : ", Label.RIGHT); // ���Է� â�� �ؽ�Ʈ �� ���������� ��ġ�Ѵ�.

		 id = new TextField(10); // 10���ڱ��� �Է� ������ �ؽ�Ʈ �ʵ�
		 pwd = new TextField(10); // 10���ڱ��� �Է� ������ �ؽ�Ʈ �ʵ�
		 pwd.setEchoChar('*'); // ��й�ȣ �Է��ϸ� ****�� �ǰ��ϱ�
		 
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
		System.out.println(id.getText()); //�ؽ�Ʈ�ʵ忡�� �� �о�;���
		System.out.println(pwd.getText()); //�ؽ�Ʈ�ʵ忡�� �� �о�;���
		
		if(id.getText().equals("")) {
			
		}
	} 

	public static void main(String[] args) {
		new TextFieldTest();

	}

}
