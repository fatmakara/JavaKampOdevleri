package kampOdev2;

public class Main {
	public static void main(String[] args) {
		
		
		Course course1 = new Course("Engin Demiroğ", "Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)", 82);
		Course course2 = new Course( "Engin Demiroğ","Yazılım Geliştirici Yetiştirme Kampı (Java + React)", 32);
		
		Course[] courses = {course1,course2};
		
	
		
	
	   for(Course course:courses) {
		   
		   System.out.println(course.name);
		
		
	}
	 
	   CourseManager courseManager = new CourseManager();
	  
	  courseManager.registerCourse(course1);
	  courseManager.registerCourse(course2);
	  
	  
  }
	  
  }
    
