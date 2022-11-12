import java.util.Scanner;

class Square  {
	int x;
	int y;
	int x2;
	int y2;

	public Square(int x, int y, int x2, int y2) {
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	} 
 
	void print() {

		
		System.out.println(x + " " + y + " " + x2 + " " + y2);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}
}

public class J197 {
	public static void main(String[] args) {
		Square[] s = new Square[2];
		Scanner sc = new Scanner(System.in);

		// 직사각형 좌표 입력받아서 객체배열에 저장하기
		for (int i = 0; i < s.length; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			s[i] = new Square(x, y, x2, y2);
		}

		// 출력해야할 최대값, 최소값 좌표 구하기
		int minx = 0;
		int miny = 0;
		int maxx2 = 0;
		int maxy2 = 0;
		for (int i = 0; i < s.length; i++) {

			if (s[0].x < s[1].x) {
				minx = s[0].x;
			} else {
				minx = s[1].x;
			}

			if (s[0].y < s[1].y) {
				miny = s[0].y;
			} else {
				miny = s[1].y;

			}
			if (s[0].x2 < s[1].x2) {
				maxx2 = s[1].x2;
			} else {
				maxx2 = s[0].x2;
			}
			
			if (s[0].y2 < s[1].y2) {
				maxy2 = s[1].y2;
			} else {
				maxy2 = s[0].y2;
			}

		}
		System.out.println(minx + " " + miny + " " + maxx2 + " " + maxy2);

		sc.close();
	}
}
