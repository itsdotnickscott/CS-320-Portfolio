/******************************************************************************

AppointmentTest.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 8/9/2026

*******************************************************************************/

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


// Note: Date class is mostly deprecated but used for assignment anyway
@SuppressWarnings("deprecation")
public class AppointmentTest {
	@DisplayName("Appointment constructor is valid")
	@Test
	void testAppointmentConstructor() {
		String appointmentID = "0";
		Date date = new Date(3000-1900, 1, 1); // This argument is guaranteed to work for the next 974 years, update if after 1/1/3000
		String description = "Complete java classes and unit tests";
		
		Appointment testAppt = new Appointment(appointmentID, date, description);
		
		// test all info of appointment matches
		assertEquals(appointmentID, testAppt.getAppointmentID());
		assertEquals(date, testAppt.getDate());
		assertEquals(description, testAppt.getDescription());
	}
	
	
	@DisplayName("AppointmentID cannot be null")
	@Test
	void testNullAppointmentID() {
		String appointmentID = null;
		Date date = new Date(3000-1900, 1, 1); 
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(appointmentID, date, description);
		});
	}
	
	
	@DisplayName("Date cannot be null")
	@Test
	void testNullDate() {
		String appointmentID = "0";
		Date date = null; 
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(appointmentID, date, description);
		});
	}
	
	
	@DisplayName("Description cannot be null")
	@Test
	void testNullDescription() {
		String appointmentID = "0";
		Date date = new Date(3000-1900, 1, 1); 
		String description = null;
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(appointmentID, date, description);
		});
	}
	
	
	@DisplayName("AppointmentID is required")
	@Test
	void testEmptyAppointmentID() {
		String appointmentID = "";
		Date date = new Date(3000-1900, 1, 1); 
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(appointmentID, date, description);
		});
	}
	
	
	// Note: "Date is required" test is satisfied by the "Date cannot be null" test
	
	
	@DisplayName("Description is required")
	@Test
	void testEmptyDescription() {
		String appointmentID = "0";
		Date date = new Date(3000-1900, 1, 1); 
		String description = "";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(appointmentID, date, description);
		});
	}
	
	
	@DisplayName("AppointmentID cannot be longer than 10 characters")
	@Test
	void testLengthyAppointmentID() {
		String appointmentID = "xxxxxxxxxxx";
		Date date = new Date(3000-1900, 1, 1); 
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(appointmentID, date, description);
		});
	}
	
	
	@DisplayName("Date cannot be in the past")
	@Test
	void testPastDate() {
		String appointmentID = "0";
		Date date = new Date(2000-1900, 1, 1); 
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(appointmentID, date, description);
		});
	}
	
	
	@DisplayName("Description cannot be longer than 50 characters")
	@Test
	void testLengthyDescription() {
		String appointmentID = "0";
		Date date = new Date(3000-1900, 1, 1); 
		String description = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(appointmentID, date, description);
		});
	}
	
	
	@DisplayName("Date can be updated")
	@Test
	void testSetDate() {
		String appointmentID = "0";
		Date date = new Date(3000-1900, 1, 1); 
		String description = "Complete java classes and unit tests";
		
		Appointment testAppt = new Appointment(appointmentID, date, description);
		assertEquals(date, testAppt.getDate());
		
		Date newDate = new Date(3001-1900, 1, 1); // This argument is guaranteed to work for the next 975 years, update if after 1/1/3001
		testAppt.setDate(newDate); 
		assertEquals(newDate, testAppt.getDate());
	}
	
	
	@DisplayName("Description can be updated")
	@Test
	void testSetDescription() {
		String appointmentID = "0";
		Date date = new Date(3000-1900, 1, 1); 
		String description = "Complete java classes and unit tests";
		
		Appointment testAppt = new Appointment(appointmentID, date, description);
		assertEquals(description, testAppt.getDescription());
		
		String newDescription = "Meet up with professor";
		testAppt.setDescription(newDescription); 
		assertEquals(newDescription, testAppt.getDescription());
	}
}
