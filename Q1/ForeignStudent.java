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
        System.out.print("�л� [ �̸� : " + getName() + ", ");
        System.out.print("���� : " + getAge() + ", ");
        System.out.print("�й� : " + getStudentId() + ", ");
        System.out.println("���� : " + nationality + " ]");
    }
 
}
