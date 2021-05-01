package homework3;

public class InstructorManager extends userManager{
	
	public void addlessons(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " 4.ders izlencesini  yayınlandınız.");
		
	}
	
	public void getcontrol(Instructor instructor) {
		System.out.println(instructor.getFirstName()  + " " + instructor.getLastName() + " Ödevleri kontol ettiniz.");
	}
	
	public void setsignUp(user user) {
		System.out.println(user.getFirstName() + " " +user.getLastName() + " Çıkış yaptınız. ");
	}
	

}
