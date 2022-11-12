import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Memo extends WindowAdapter {

	// x누르면 종료될 수 있도록
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public Memo() {
		Frame f = new Frame("Windows 메모장");
		f.setSize(700, 500);
		f.setLocation(500, 500);
		f.addWindowListener(this);

		// 메뉴바 생성
		MenuBar mb = new MenuBar();

		// 1번메뉴 파일 구현
		Menu mFile = new Menu("파일(F)"); // 1번 메뉴바

		MenuItem miNew = new MenuItem("새로만들기(N)");
		MenuItem miNewW = new MenuItem("새창(W)");
		MenuItem miOpen = new MenuItem("열기(C)");
		MenuItem miSave = new MenuItem("저장(S)");
		MenuItem miAnotherSave = new MenuItem("다른 이름으로 저장(A)");
		MenuItem miSetPage = new MenuItem("페이지 설정(U)...");
		MenuItem miPrint = new MenuItem("인쇄(P)...");
		MenuItem miExIt = new MenuItem("끝내기(X)");

		// 메뉴바에 부착해주기.
		mFile.add(miNew);
		mFile.add(miNewW);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miAnotherSave);
		mFile.addSeparator(); // 구역을 나눌 수 있는 줄이 생긴다.
		mFile.add(miSetPage);
		mFile.add(miPrint);
		mFile.addSeparator(); // 구역을 나눌 수 있는 줄이 생긴다.
		mFile.add(miExIt);

		miExIt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);

			}
		});

		// 2번 메뉴 편집 구현
		Menu mEdit = new Menu("편집(E)"); // 2번 메뉴바
		mFile.add(miNewW);
		mFile.add(miOpen);

		// 3번 메뉴 서식 수현
		Menu mO = new Menu("서식(O)"); // 3번 메뉴바
		MenuItem miEnter = new MenuItem("자동 줄 바꿈(W)");
		MenuItem miFont = new MenuItem("글꼴(F)...");

		mO.add(miEnter);
		mO.add(miFont);

		// 4번 메뉴바 보기 구현

		Menu mSee = new Menu("보기(V)"); // Menu로 구현해야 또 다른 메뉴가 나옴

		Menu miInOut = new Menu("확대하기/축소하기"); // Menu로 구현해야 또 다른 메뉴가 나옴
		MenuItem mStatus = new Menu("상태 표시줄(S)"); // 4번 메뉴바

		mSee.add(miInOut);
		mSee.add(mStatus);

		// 누르면 나오는 또 다른 리스트들 구현
		MenuItem MiZoomIn = new MenuItem("확대(l)");
		MenuItem MiZoomOut = new MenuItem("축소(O)");
		MenuItem miRestore = new MenuItem("확대하기/축소하기 기본값 복원");
		// mSee에 부착해주기
		miInOut.add(MiZoomIn);
		miInOut.add(MiZoomOut);
		miInOut.add(miRestore);

		// 5번 메뉴바
		Menu mHelp = new Menu("도움말(H)"); // 5번 메뉴바
		mHelp.add(miWatchHelp);
		mHelp.add(miFeedback);
		mHelp.addSeparator(); // 구역을 나눌 수 있는 줄이 생긴다.
		mHelp.add(miInfo);

		// 생성한 메뉴들 메뉴바에 부착해주기.
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mO);
		mb.add(mSee);
		mb.setHelpMenu(mHelp);// 인자로 넘겨받은menu를Help menu로 지정한다

		f.setMenuBar(mb);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Memo();
	}
}