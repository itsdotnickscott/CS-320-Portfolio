/******************************************************************************

ContactService.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 8/9/2026

*******************************************************************************/

import java.util.HashMap;


public class ContactService {
	// Class attributes
	private int currID = 0;
	private HashMap<String, Contact> contacts = new HashMap<String, Contact>();
	
	
	public void addContact(String firstName, String lastName, String phone, String address) {
		Contact newContact = new Contact(Integer.toString(currID), firstName, lastName, phone, address);
		contacts.put(Integer.toString(currID), newContact);
		currID++;
	}
	
	
	public Contact getContactByID(String contactID) {
		return contacts.get(contactID);
	}
	
	
	public HashMap<String, Contact> getContacts() {
		return contacts;
	}
	
	
	public void deleteContact(String contactID) {
		contacts.remove(contactID);
	}
	
	
	public void updateFirstName(String contactID, String firstName) {
		getContactByID(contactID).setFirstName(firstName);
	}
	
	
	public void updateLastName(String contactID, String lastName) {
		getContactByID(contactID).setLastName(lastName);
	}
	
	
	public void updatePhone(String contactID, String phone) {
		getContactByID(contactID).setPhone(phone);
	}
	
	
	public void updateAddress(String contactID, String address) {
		getContactByID(contactID).setAddress(address);
	}
}
