package question08;

public class Person {
	public String lastName;
	public String firstName;
	
	public int getLength() {
		return lastName.length()+firstName.length();
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
}
