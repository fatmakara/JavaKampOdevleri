package homework3;

public class studentManager extends userManager{
	
	@Override
	
	 public  void getsignIn(Student student){
		System.out.println(student.getFirstName()  + " kursa giriş yaptı.");
	}
	  public void setdelete(Student student) {
		  System.out.println(student.getFirstName() + " kursu güncelledi.");

	}
	  public void addlessons(Student student) {
		  System.out.println(student.getFirstName() + "  sisteme ödevi yükledi. ");
	  }
	  
	
	
}
