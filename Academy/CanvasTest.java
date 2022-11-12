import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasTest {
	public static void main(String[] args) {
		Frame f = new Frame("Canvas Test");
		f.setSize(300, 200);
		f.setLayout(null); // Frame의 Layout Manager설정을 해제한다.

		Canvas c = new Canvas();
		c.setBackground(Color.pink); // 캔버스 배경 핑크로
		c.setBounds(50, 50, 100, 200); // Canvas의 위치(x,y), 크기(w,h);


		f.add(c);
		f.setVisible(true);
	}

}
