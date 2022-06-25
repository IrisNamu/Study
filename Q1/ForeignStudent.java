package Q1;

public class ForeignStudent extends Student {
	 
    private String nationality;
 
    public ForeignStudent() {
        this.nationality = "";
    }
 
    public String getNationality() {
        return nationality;
    }
 
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void show() {
        System.out.print("학생 [ 이름 : " + getName() + ", ");
        System.out.print("나이 : " + getAge() + ", ");
        System.out.print("학번 : " + getStudentId() + ", ");
        System.out.println("국적 : " + nationality + " ]");
    }
 
}
