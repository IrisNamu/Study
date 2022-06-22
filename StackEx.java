import java.util.Stack;

class Coin {

	private int price; // value 동전의 가격

	public Coin(int n) { // 생성자
		price = n;
	}

	public int getValue() { // 겟 메서드
		return price;
	}

}

public class StackEx {

	public static void main(String[] args) {

		// 동전을 저장 하기때문에 제너릭파나미트로 Coin 쓴다
		// 동전통을 coinBox로 변수 선언
		Stack<Coin> CoinBox = new Stack<Coin>();

		CoinBox.push(new Coin(20)); // 동전을 넣는다.
		CoinBox.push(new Coin(70));
		CoinBox.push(new Coin(100));
		CoinBox.push(new Coin(130));

		while (!CoinBox.isEmpty()) { // 동전 통에서 가져올것이 있으면 트루, 없으면 거짓
			Coin coin = CoinBox.pop(); // coinBox가 비어있지 않다면 Stack 메소드중 하나인 pop사용 객체를 스텍에서 제거
			System.out.println("꺼내온 동전 : " + coin.getValue() + " 원");
		}
	}

}
