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
        System.out.print("학생 [ 이름 : " + getName() + ", ");
        System.out.print("나이 : " + getAge() + ", ");
        System.out.println("학번 : " + studentId + " ]");
    }
 
}