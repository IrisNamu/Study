import java.util.Scanner;

class Person {
	private String name;
	private String tel;
	private String addr;

	public Person(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	void print() {

		System.out.println("name : " + this.name);
		System.out.println("tel : " + this.tel);
		System.out.println("addr : " + this.addr);
	}

}

public class J196 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person[] p = new Person[3];
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			p[i] = new Person(name, tel, addr);

		}
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
		
		

	}
}
