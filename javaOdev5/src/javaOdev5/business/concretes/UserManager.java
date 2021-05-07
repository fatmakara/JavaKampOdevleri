package javaOdev5.business.concretes;

import java.util.regex.Pattern;

import javaOdev5.business.abstracts.UserService;
import javaOdev5.core.GoogleAuthService;
import javaOdev5.dataAccess.abstracts.UserDao;
import javaOdev5.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private GoogleAuthService googleAuthService;
	
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	

	public static boolean isEmailValid(String emailInput) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
	     return pattern.matcher(emailInput).find();

	
	}
	
	
	public UserManager(UserDao userDao, GoogleAuthService googleAuthService) {
		super();
		this.userDao = userDao;
		this.googleAuthService = googleAuthService;
	}

	@Override
	public void register(User user) {
		if(user.getName().length() <=2 && user.getSurname().length() <=2) {
			System.out.println( "Adınız ve soyadınız en az 3 karakterden oluşmalıdır.!!");
			return;
		}
		if(user.getPassword().length()<=6) {
			System.out.println( "Şifreniz en az 6 karakterden oluşmalıdır.!!");
			return;
		
		}
		if(!(isEmailValid(user.getEmail()))) {
			System.out.println( "Lütfen email adresinizi kontol ediniz");
			return;
		}else {
			System.out.println( "Sisteme doğrulama kodu gönderildi.");
			
		}
		userDao.add(user);
		
	}

	@Override
	public void verify(User user) {
		int realCode = (int)(100*Math.random() *10000);
		System.out.println( "Doğrulama kodounuz:" + realCode);
		
		System.out.println( "Gönderilen Doğrulama kodunu giriniz");
		
		System.out.println( "Doğrulama başarılı");
		
	}

	@Override
	public void login(User user) {
		if(user.getEmail().equals(user)== user.getPassword().equals(user)) {
			System.out.println(user.getName() + " :KODLAMA İO HOŞGELDİNİZ.");
		}
		
	}

	@Override
	public void signUpWithGoogle(String email, String password) {
		googleAuthService.sign(email, password);
		User user = new User(3, "Fatma ", "Kara" ,email,password);
		user.setEmail(email);
		
	}

	@Override
	public User getByMail(String mail) {
		return userDao.getByEmail(mail);
		
	}

	

	}



	
