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

		// 다이얼로그 창
		Dialog info = new Dialog(f, "Information", true);
		// parent Frame을 f로 하고, modal을 true로 해서 필수 응답 dialog로 함.
		// 만약 false로 하면

		info.setSize(140, 90);
		info.setLocation(50, 50); //// parent Frame이 아닌, 화면이 위치의 기준이 된다.
		info.setLayout(new FlowLayout());

		// 다이얼로그 창 안에 라벨
		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");
		
		//ok버튼을 액션리스너에 추가
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				info.dispose(); //Dialog를 닫는다. (화면에 안 보이게 한 후, 메모리에서 제거)


			}
		});

		info.add(msg);// 다이얼로그창에 라벨 부착
		info.add(ok); // 다이얼로그에 버튼 부착

		f.setVisible(true);// 프레임창 보이게
		info.setVisible(true); //
	}

}
