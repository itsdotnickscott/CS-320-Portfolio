/******************************************************************************

Contact.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 7/31/2026

*******************************************************************************/


public class Contact {
	// Class attributes
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	// Constructor
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		checkContactID(contactID);
		this.contactID = contactID;
		
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}
	
	
	// Validator functions
	private void checkContactID(String contactID) {
		// contact ID can neither be null, empty, nor be longer than 10 chars
		if (contactID == null || contactID.length() > 10 || contactID.isEmpty()) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
	}
	
	
	private void checkFirstName(String firstName) {
		// first name can neither be null, empty, nor be longer than 10 chars
		if (firstName == null || firstName.length() > 10 || firstName.isEmpty()) {
			throw new IllegalArgumentException("Invalid first name");
		}
	}
	
	
	private void checkLastName(String lastName) {
		// last name can neither be null, empty, nor be longer than 10 chars
		if (lastName == null || lastName.length() > 10 || lastName.isEmpty()) {
			throw new IllegalArgumentException("Invalid last name");
		}
	}
	
	
	private void checkPhone(String phone) {
		// phone can neither be null nor empty, and must be exactly 10 chars
		if (phone == null || phone.length() != 10 || phone.isEmpty()) {
			throw new IllegalArgumentException("Invalid phone number");
		}
	}
	
	
	private void checkAddress(String address) {
		// address can neither be null, empty, nor be longer than 30 chars
		if (address == null || address.length() > 30 || address.isEmpty()) {
			throw new IllegalArgumentException("Invalid address");
		}
	}
	
	
	// Accessors
	public String getContactID() {
		return this.contactID;
	}
	
	
	public String getFirstName() {
		return this.firstName;
	}
	
	
	public String getLastName() {
		return this.lastName;
	}
	
	
	public String getPhone() {
		return this.phone;
	}
	
	
	public String getAddress() {
		return this.address;
	}
	
	
	// Mutators
	// Note: no setter exists for contact ID, can only be set once through the constructor
	public void setFirstName(String firstName) {
		checkFirstName(firstName); // meant to throw exception before setting attribute below
		this.firstName = firstName;
	}
	
	
	public void setLastName(String lastName) {
		checkLastName(lastName);
		this.lastName = lastName;
	}
	
	
	public void setPhone(String phone) {
		checkPhone(phone);
		this.phone = phone;
	}
	
	
	public void setAddress(String address) {
		checkAddress(address);
		this.address = address;
	}
}
