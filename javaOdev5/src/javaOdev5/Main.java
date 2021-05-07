package javaOdev5;

import java.util.ArrayList;

import javaOdev5.business.abstracts.UserService;
import javaOdev5.business.concretes.UserManager;
import javaOdev5.core.GoogleAuthAdapter;
import javaOdev5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		UserService userService = new UserManager( null, new GoogleAuthAdapter());
		User user = new User(6, "Feyza", "Kara", "feyzakara45 ", "3837367");
		userService.register(user);
		userService.verify(user);
		userService.login(user);
		users.add(user);
		userService.signUpWithGoogle( "feyzakara45@gmail.com",  "İyi Günler:)");
		
		

	}

}
