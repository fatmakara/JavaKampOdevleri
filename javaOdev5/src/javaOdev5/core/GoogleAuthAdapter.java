package javaOdev5.core;

import javaOdev5.googleAuth.GoogleAuthManager;

public class GoogleAuthAdapter implements GoogleAuthService{
	
	@Override
	
	public void sign(String email, String message) {
		GoogleAuthManager googleAuth = new GoogleAuthManager();
		googleAuth.sign(email,message);
	}

}
