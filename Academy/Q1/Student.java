package Q1;

public class Student extends Person {
	 
    private String studentId;
 
    public Student() {
        this.studentId = "";
    }
 
    public String getStudentId() {
        return studentId;
    }
 
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public void show() {
        System.out.print("�л� [ �̸� : " + getName() + ", ");
        System.out.print("���� : " + getAge() + ", ");
        System.out.println("�й� : " + studentId + " ]");
    }
 
}