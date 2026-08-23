/******************************************************************************

ContactTest.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 8/9/2026

*******************************************************************************/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource; 
import org.junit.jupiter.params.provider.NullSource;   


public class ContactTest {
	@DisplayName("Contact constructor is valid")
	@Test
	void testContactConstructor() {
		String contactID = "1";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Contact testContact = new Contact(contactID, firstName, lastName, phone, address);
		
		assertEquals(contactID, testContact.getContactID());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phone, testContact.getPhone());
		assertEquals(address, testContact.getAddress());
	}
	
	
	@DisplayName("ContactID cannot be null")
	@Test
	void testNullContactID() {
		String contactID = null;
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("First name cannot be null")
	@Test
	void testNullFirstName() {
		String contactID = "0";
		String firstName = null;
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("Last name cannot be null")
	@Test
	void testNullLastName() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = null;
		String phone = "0123456789";
		String address = "123 Address St.";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("Phone cannot be null")
	@Test
	void testNullPhone() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = null;
		String address = "123 Address St.";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("Address cannot be null")
	@Test
	void testNullAddress() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = null;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("ContactID cannot be more than 10 characters")
	@Test
	void testContactIDLimit() {
		String contactID = "xxxxxxxxxxxxxxxxxxxxxx";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("First name cannot be more than 10 characters")
	@Test
	void testFirstNameLimit() {
		String contactID = "1";
		String firstName = "xxxxxxxxxxxxxxxxxxxxxx";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("Last name cannot be more than 10 characters")
	@Test
	void testLameNameLimit() {
		String contactID = "1";
		String firstName = "Jane";
		String lastName = "xxxxxxxxxxxxxxxxxxxxxx";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("Phone must be exactly 10 characters")
	@ParameterizedTest
	@ValueSource(strings = {"1", "123456789000"})
	@NullSource
	void testPhoneCharSize(String testPhone) {
		String contactID = "1";
		String firstName = "Jane";
		String lastName = "Doe";
		String shortPhone = "1";
		String longPhone = testPhone;
		String address = "123 Address St.";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, shortPhone, address);
		});
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, longPhone, address);
		});
	}
	
	
	@DisplayName("Last name cannot be more than 30 characters")
	@Test
	void testAddressLimit() {
		String contactID = "1";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("ContactID cannot be empty")
	@Test
	void testEmptyContactID() {
		String contactID = "";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("First name cannot be empty")
	@Test
	void testEmptyFirstName() {
		String contactID = "0";
		String firstName = "";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("Last name cannot be empty")
	@Test
	void testEmptyLastName() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("Phone cannot be empty")
	@Test
	void testEmptyPhone() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "";
		String address = "123 Address St.";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("Address cannot be empty")
	@Test
	void testEmptyAddress() {
		String contactID = "0";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "";
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, firstName, lastName, phone, address);
		});
	}
	
	
	@DisplayName("First name can be updated")
	@Test
	void testSetFirstName() {
		String contactID = "1";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Contact testContact = new Contact(contactID, firstName, lastName, phone, address);
		
		String newFirstName = "Nick";
		
		testContact.setFirstName(newFirstName);
		assertEquals(newFirstName, testContact.getFirstName());
	}
	
	
	@DisplayName("Last name can be updated")
	@Test
	void testSetLastName() {
		String contactID = "1";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Contact testContact = new Contact(contactID, firstName, lastName, phone, address);
		
		String newLastName = "Scott";
		
		testContact.setLastName(newLastName);
		assertEquals(newLastName, testContact.getLastName());
	}
	
	
	@DisplayName("Phone can be updated")
	@Test
	void testSetPhone() {
		String contactID = "1";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Contact testContact = new Contact(contactID, firstName, lastName, phone, address);
		
		String newPhone = "9876543210";
		
		testContact.setPhone(newPhone);
		assertEquals(newPhone, testContact.getPhone());
	}
	
	
	@DisplayName("Address can be updated")
	@Test
	void testSetAddress() {
		String contactID = "1";
		String firstName = "Jane";
		String lastName = "Doe";
		String phone = "0123456789";
		String address = "123 Address St.";
	
		Contact testContact = new Contact(contactID, firstName, lastName, phone, address);
		
		String newAddress = "456 Way Ave.";
		
		testContact.setAddress(newAddress);
		assertEquals(newAddress, testContact.getAddress());
	}
}




















































