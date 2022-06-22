import java.util.Stack;

class Coin {

	private int price; // value ������ ����

	public Coin(int n) { // ������
		price = n;
	}

	public int getValue() { // �� �޼���
		return price;
	}

}

public class StackEx {

	public static void main(String[] args) {

		// ������ ���� �ϱ⶧���� ���ʸ��ĳ���Ʈ�� Coin ����
		// �������� coinBox�� ���� ����
		Stack<Coin> CoinBox = new Stack<Coin>();

		CoinBox.push(new Coin(20)); // ������ �ִ´�.
		CoinBox.push(new Coin(70));
		CoinBox.push(new Coin(100));
		CoinBox.push(new Coin(130));

		while (!CoinBox.isEmpty()) { // ���� �뿡�� �����ð��� ������ Ʈ��, ������ ����
			Coin coin = CoinBox.pop(); // coinBox�� ������� �ʴٸ� Stack �޼ҵ��� �ϳ��� pop��� ��ü�� ���ؿ��� ����
			System.out.println("������ ���� : " + coin.getValue() + " ��");
		}
	}

}
