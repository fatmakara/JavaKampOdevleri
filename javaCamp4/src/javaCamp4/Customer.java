package javaCamp4;

public class Customer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationaliIdenty;
	public Customer(int id, String firstName, String lastName, String nationaliIdenty) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaliIdenty = nationaliIdenty;
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
	public String getNationaliIdenty() {
		return nationaliIdenty;
	}
	public void setNationaliIdenty(String nationaliIdenty) {
		this.nationaliIdenty = nationaliIdenty;
	}
	
	

}
