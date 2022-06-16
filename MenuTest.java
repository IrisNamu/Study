import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest extends WindowAdapter {

	//x누르면 종료될 수 있도록
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public MenuTest() {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);
		f.addWindowListener(this);

		// 메뉴바 생성
		MenuBar mb = new MenuBar();

		// 메뉴바 중 파일이라는 항복을 생성하고 거기에 들어가는 리스트들
		Menu mFile = new Menu("File"); // 1번 메뉴바

		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others"); // Menu로 구현해야 또 다른 메뉴가 나옴
		MenuItem miExIt = new MenuItem("Exit");

		// 메뉴바에 부착해주기.
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator(); // 구역을 나눌 수 있는 줄이 생긴다.
		mFile.add(miExIt);

		// other을 누르면 나오는 또 다른 리스트들 구현
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview...");
		MenuItem miSetup = new MenuItem("Print Setup...");
		// mOthers에 부착해주기
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
		

		// 메뉴들 추가!
		Menu mEdit = new Menu("Edit"); // 2번 메뉴바
		Menu mView = new Menu("View"); // 3번 메뉴바
		Menu mHelp = new Menu("Help"); // 4번 메뉴바

		// 생성한 메뉴들 메뉴바에 부착해주기.
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);// 인자로 넘겨받은menu를Help menu로 지정한다

		f.setMenuBar(mb);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new MenuTest();
	}
}