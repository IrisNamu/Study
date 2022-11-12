package p49;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound(); //추상메서드가 하나라도 있다면 추상클래스
}
