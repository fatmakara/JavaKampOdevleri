package homework3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName( "Engin");
		instructor.setLastName( "Demiroğ");
		instructor.setUserName( "Demiroğengin1");
		instructor.setPassword( "******");
		
		
		 System.out.println();
		 
		 
		 
		 Student student = new Student();
		 student.setId(2);
		 student.setFirstName( "Fatma");
		 student.setLastName( "Kara");
		 student.setUserName( "karafato12");
		 student.setPassword( "0000");
		 
		 
		 System.out.println();
		 
		 InstructorManager instructorManager = new InstructorManager();
		 instructorManager.addlessons(instructor);
		 instructorManager.getcontrol(instructor);
		 instructorManager.setsignUp(instructor);
		 
		 System.out.println();
		 
		 homework3.studentManager studentManager = new homework3.studentManager();
		 studentManager.getsignIn(student);
		 studentManager.setdelete(student);
		 studentManager.addlessons(student);
		 
		 
		 
		 
		
		 
	}
	
	
	
	
}







