package Entities;

import Abstract.Entity;

public class Customer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private String dateOfBirthYear;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String nationalityId, String dateOfBirthYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirthYear = dateOfBirthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public void setDateOfBirthYear(String dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}
}

	
