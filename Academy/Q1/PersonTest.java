package Q1;

public class PersonTest {

	public static void main (String[]args) {
	
	Person person = new Person();
    person.setName("길동이");
    person.setAge(22);

    Student student = new Student();
    student.setName("황진이");
    student.setAge(23);
    student.setStudentId("100");

    ForeignStudent foreignStudent = new ForeignStudent();
    foreignStudent.setName("Amy");
    foreignStudent.setAge(30);
    foreignStudent.setStudentId("200");
    foreignStudent.setNationality("U.S.A");

    Person[] people = { person, student, foreignStudent };

    for (int i = 0; i < people.length; i++) {
        people[i].show();
    }

    System.out.println("\n\n");

    for (Person p : people) {
        p.show();
    }

}

}
