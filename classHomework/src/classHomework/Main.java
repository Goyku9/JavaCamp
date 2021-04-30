package classHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentNumber = 9 ;
		student1.name = "öykü yüksel";
		student1.age = 24;
		student1.major = "compeng";
		student1.gno = 3.02;

		
		
		Student student2 = new Student(10,"burcu küçük", 23, "utf", 2.48);
		Student student3 = new Student(11,"ilkay sönmez", 20, "doctor", 3.56);
		
		Student[] students = {student1, student2, student3};
		
		for(Student student : students) {
			
			System.out.println(student.studentNumber);
		}
		
		StudentManager manage = new StudentManager();
		manage.addToStudent(student1);
		manage.showToStudentGNO(student1);
		manage.addToStudent(student2);
		manage.showToStudentGNO(student2);
		manage.addToStudent(student3);
		manage.showToStudentGNO(student3);
		
		

	}

}
