import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);

		// ���̾�α� â
		Dialog info = new Dialog(f, "Information", true);
		// parent Frame�� f�� �ϰ�, modal�� true�� �ؼ� �ʼ� ���� dialog�� ��.
		// ���� false�� �ϸ�

		info.setSize(140, 90);
		info.setLocation(50, 50); //// parent Frame�� �ƴ�, ȭ���� ��ġ�� ������ �ȴ�.
		info.setLayout(new FlowLayout());

		// ���̾�α� â �ȿ� ��
		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");
		
		//ok��ư�� �׼Ǹ����ʿ� �߰�
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				info.dispose(); //Dialog�� �ݴ´�. (ȭ�鿡 �� ���̰� �� ��, �޸𸮿��� ����)


			}
		});

		info.add(msg);// ���̾�α�â�� �� ����
		info.add(ok); // ���̾�α׿� ��ư ����

		f.setVisible(true);// ������â ���̰�
		info.setVisible(true); //
	}

}
