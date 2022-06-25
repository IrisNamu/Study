package Q1_Q2;

public class Person {
	private String name;
	private String school;
	private int grade;

	Person(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}


}