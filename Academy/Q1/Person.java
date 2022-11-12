package Q1;

public class Person {
	 
    private String name;
    private int age;
 
    public Person() {
        name = "";
        age = 0;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    void show() {
        System.out.println("사람 [ 이름 : " + name + ", 나이 : " + age + " ]");
    }
 
}
