package javaOdev5.business.abstracts;

import javaOdev5.entities.concretes.User;

public interface UserService {
	void register(User user);
	void verify(User user);
	void login(User user);
	void signUpWithGoogle(String email,String message);
	User getByMail(String mail);
	
	

}
