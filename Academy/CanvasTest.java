import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasTest {
	public static void main(String[] args) {
		Frame f = new Frame("Canvas Test");
		f.setSize(300, 200);
		f.setLayout(null); // Frame�� Layout Manager������ �����Ѵ�.

		Canvas c = new Canvas();
		c.setBackground(Color.pink); // ĵ���� ��� ��ũ��
		c.setBounds(50, 50, 100, 200); // Canvas�� ��ġ(x,y), ũ��(w,h);


		f.add(c);
		f.setVisible(true);
	}

}
