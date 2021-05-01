package homework3;

public class userManager {
	public void add(Student student ) {
		System.out.println(student.getFirstName() + " dersi listeye ekledi. ");
		
	}
	
	public void  getsignIn(Student student) {
		System.out.println(student.getFirstName() + " Giriş başarılı ");
		
	}
	 public void setsignUp(Student student) {
		 System.out.println(student.getFirstName() + " Çıkış yapıldı ");
	 }

}
