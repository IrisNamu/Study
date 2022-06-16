import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest extends WindowAdapter {

	//x������ ����� �� �ֵ���
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public MenuTest() {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);
		f.addWindowListener(this);

		// �޴��� ����
		MenuBar mb = new MenuBar();

		// �޴��� �� �����̶�� �׺��� �����ϰ� �ű⿡ ���� ����Ʈ��
		Menu mFile = new Menu("File"); // 1�� �޴���

		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others"); // Menu�� �����ؾ� �� �ٸ� �޴��� ����
		MenuItem miExIt = new MenuItem("Exit");

		// �޴��ٿ� �������ֱ�.
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator(); // ������ ���� �� �ִ� ���� �����.
		mFile.add(miExIt);

		// other�� ������ ������ �� �ٸ� ����Ʈ�� ����
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview...");
		MenuItem miSetup = new MenuItem("Print Setup...");
		// mOthers�� �������ֱ�
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		miExIt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		

		// �޴��� �߰�!
		Menu mEdit = new Menu("Edit"); // 2�� �޴���
		Menu mView = new Menu("View"); // 3�� �޴���
		Menu mHelp = new Menu("Help"); // 4�� �޴���

		// ������ �޴��� �޴��ٿ� �������ֱ�.
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);// ���ڷ� �Ѱܹ���menu��Help menu�� �����Ѵ�

		f.setMenuBar(mb);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new MenuTest();
	}
}