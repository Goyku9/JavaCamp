package classHomework;

public class Student {
	
	
	public Student() {
		
		System.out.println("öðrenci kaydý");
	}
	public Student(int studentNumber, String name, int age, String major, double gno) {
		
		this.studentNumber = studentNumber;
		this.name = name;
		this.age = age;
		this.major = major;
		this.gno = gno;
		
	}
	int studentNumber;
	String name;
	int age;
	String major;
	double gno;
	

}
