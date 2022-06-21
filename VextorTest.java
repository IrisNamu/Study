package collection_framework;

import java.util.List;
import java.util.Vector;

class Board {
	String subject;
	String content;

	public Board(String subject, String content) {
		this.subject = subject;
		this.content = content;
	}
}

public class VextorTest {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("����1", "����1"));
		list.add(new Board("����2", "����2"));
		list.add(new Board("����3", "����3"));
		list.add(new Board("����4", "����4"));
		list.add(new Board("����5", "����5"));

		list.remove(2);
		list.remove(3);

		//list�� �ݺ��ϸ� ��ü�� ������ ���
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content);
		}
	}

}
