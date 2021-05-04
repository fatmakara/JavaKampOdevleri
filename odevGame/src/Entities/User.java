package Entities;

import Abstract.Entity;

public class User implements Entity{
	private int id;
	private String password;
	private String email;
	
	
	public User(int id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

}
