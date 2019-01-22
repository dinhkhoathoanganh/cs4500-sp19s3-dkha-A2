package cs4500.A2.models;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	// provide a public set and get method for each of the class variables above
	// make sure to use proper naming conventions for Java methods, e.g.,
	// methods should be camelcase. Here's an example using the firstName variable:
	public User(Integer id, String username, String password, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
 	public String getFirstName() {
		return firstName;
	}
 	public String getLastName() {
		return lastName;
	}
 	public Integer getId() {
		return id;
	}
 	public String getUsername() {
		return username;
	}
 	public String getPassword() {
		return password;
	}
}
