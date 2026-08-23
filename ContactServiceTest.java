/******************************************************************************

ContactServiceTest.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 7/31/2026

*******************************************************************************/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ContactServiceTest {
	@DisplayName("Contact can be added to ContactService")
	@Test
	void testAddContact() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
		
		ContactService testService = new ContactService();
		
		assertTrue(testService.getContacts().isEmpty());
		
		testService.addContact(firstName, lastName, phone, address);
		
		assertEquals(1, testService.getContacts().size());
		assertEquals(firstName, testService.getContactByID(contactID).getFirstName());
		assertEquals(lastName, testService.getContactByID(contactID).getLastName());
		assertEquals(phone, testService.getContactByID(contactID).getPhone());
		assertEquals(address, testService.getContactByID(contactID).getAddress());
	}
	
	
	@DisplayName("Contact can be deleted from ContactService")
	@Test
	void testDeleteContact() {
		String contactID1 = "0";
		String firstName1 = "Jane";
		String lastName1 = "Doe";
		String phone1 = "0123456789";
		String address1 = "123 Address St.";
		
		String contactID2 = "1";
		String firstName2 = "Nick";
		String lastName2 = "Scott";
		String phone2 = "9876543210";
		String address2 = "456 Way Ave.";
		
		ContactService testService = new ContactService();
		
		testService.addContact(firstName1, lastName1, phone1, address1);
		testService.addContact(firstName2, lastName2, phone2, address2);
		
		assertEquals(2, testService.getContacts().size());
		
		testService.deleteContact(contactID2);
		
		assertEquals(1, testService.getContacts().size());
		assertEquals(firstName1, testService.getContactByID(contactID1).getFirstName());
		assertEquals(lastName1, testService.getContactByID(contactID1).getLastName());
		assertEquals(phone1, testService.getContactByID(contactID1).getPhone());
		assertEquals(address1, testService.getContactByID(contactID1).getAddress());
		assertEquals(null, testService.getContactByID(contactID2));
	}
	
	
	@DisplayName("First name can be updated")
	@Test
	void testUpdateFirstName() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
		
		String updatedString = "xxxxxxxxxx";
		
		ContactService testService = new ContactService();
		
		testService.addContact(firstName, lastName, phone, address);
		testService.updateFirstName(contactID, updatedString);
		
		assertEquals(updatedString, testService.getContactByID(contactID).getFirstName());
	}
	
	
	@DisplayName("Last name can be updated")
	@Test
	void testUpdateLastName() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
		
		String updatedString = "xxxxxxxxxx";
		
		ContactService testService = new ContactService();
		
		testService.addContact(firstName, lastName, phone, address);
		testService.updateLastName(contactID, updatedString);
		
		assertEquals(updatedString, testService.getContactByID(contactID).getLastName());
	}
	
	
	@DisplayName("Phone can be updated")
	@Test
	void testUpdatePhone() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
		
		String updatedString = "xxxxxxxxxx";
		
		ContactService testService = new ContactService();
		
		testService.addContact(firstName, lastName, phone, address);
		testService.updatePhone(contactID, updatedString);
		
		assertEquals(updatedString, testService.getContactByID(contactID).getPhone());
	}
	
	
	@DisplayName("Address can be updated")
	@Test
	void testUpdateAddress() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
		
		String updatedString = "xxxxxxxxxx";
		
		ContactService testService = new ContactService();
		
		testService.addContact(firstName, lastName, phone, address);
		testService.updateAddress(contactID, updatedString);
		
		assertEquals(updatedString, testService.getContactByID(contactID).getAddress());
	}
}


