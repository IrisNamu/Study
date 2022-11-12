import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Memo extends WindowAdapter {

	// x������ ����� �� �ֵ���
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public Memo() {
		Frame f = new Frame("Windows �޸���");
		f.setSize(700, 500);
		f.setLocation(500, 500);
		f.addWindowListener(this);

		// �޴��� ����
		MenuBar mb = new MenuBar();

		// 1���޴� ���� ����
		Menu mFile = new Menu("����(F)"); // 1�� �޴���

		MenuItem miNew = new MenuItem("���θ����(N)");
		MenuItem miNewW = new MenuItem("��â(W)");
		MenuItem miOpen = new MenuItem("����(C)");
		MenuItem miSave = new MenuItem("����(S)");
		MenuItem miAnotherSave = new MenuItem("�ٸ� �̸����� ����(A)");
		MenuItem miSetPage = new MenuItem("������ ����(U)...");
		MenuItem miPrint = new MenuItem("�μ�(P)...");
		MenuItem miExIt = new MenuItem("������(X)");

		// �޴��ٿ� �������ֱ�.
		mFile.add(miNew);
		mFile.add(miNewW);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miAnotherSave);
		mFile.addSeparator(); // ������ ���� �� �ִ� ���� �����.
		mFile.add(miSetPage);
		mFile.add(miPrint);
		mFile.addSeparator(); // ������ ���� �� �ִ� ���� �����.
		mFile.add(miExIt);

		miExIt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);

			}
		});

		// 2�� �޴� ���� ����
		Menu mEdit = new Menu("����(E)"); // 2�� �޴���
		mFile.add(miNewW);
		mFile.add(miOpen);

		// 3�� �޴� ���� ����
		Menu mO = new Menu("����(O)"); // 3�� �޴���
		MenuItem miEnter = new MenuItem("�ڵ� �� �ٲ�(W)");
		MenuItem miFont = new MenuItem("�۲�(F)...");

		mO.add(miEnter);
		mO.add(miFont);

		// 4�� �޴��� ���� ����

		Menu mSee = new Menu("����(V)"); // Menu�� �����ؾ� �� �ٸ� �޴��� ����

		Menu miInOut = new Menu("Ȯ���ϱ�/����ϱ�"); // Menu�� �����ؾ� �� �ٸ� �޴��� ����
		MenuItem mStatus = new Menu("���� ǥ����(S)"); // 4�� �޴���

		mSee.add(miInOut);
		mSee.add(mStatus);

		// ������ ������ �� �ٸ� ����Ʈ�� ����
		MenuItem MiZoomIn = new MenuItem("Ȯ��(l)");
		MenuItem MiZoomOut = new MenuItem("���(O)");
		MenuItem miRestore = new MenuItem("Ȯ���ϱ�/����ϱ� �⺻�� ����");
		// mSee�� �������ֱ�
		miInOut.add(MiZoomIn);
		miInOut.add(MiZoomOut);
		miInOut.add(miRestore);

		// 5�� �޴���
		Menu mHelp = new Menu("����(H)"); // 5�� �޴���
		mHelp.add(miWatchHelp);
		mHelp.add(miFeedback);
		mHelp.addSeparator(); // ������ ���� �� �ִ� ���� �����.
		mHelp.add(miInfo);

		// ������ �޴��� �޴��ٿ� �������ֱ�.
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mO);
		mb.add(mSee);
		mb.setHelpMenu(mHelp);// ���ڷ� �Ѱܹ���menu��Help menu�� �����Ѵ�

		f.setMenuBar(mb);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Memo();
	}
}