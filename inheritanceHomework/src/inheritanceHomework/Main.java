package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		
		
		instructor1.id= 1;
		instructor1.instructorNumber = "1919";
		instructor1.lessonGiven = "java";
		instructor1.name = "engin";
		
		Student student1 = new Student();
		
		student1.id = 2;
		student1.studentNumber = "9999";
		student1.lessonLearned = "java";
		student1.name = "öykü";
		
		UserManager managerU=  new UserManager();
		managerU.add(student1);
		managerU.add(instructor1);
		
		InstructorManager managerI = new InstructorManager();
		managerI.showInstructor(instructor1);
		
		StudentManager managerS = new StudentManager();
		managerS.showStudent(student1);
		

	}

}
