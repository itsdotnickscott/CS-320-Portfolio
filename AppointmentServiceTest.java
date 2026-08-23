/******************************************************************************

AppointmentServiceTest.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 8/9/2026

*******************************************************************************/

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


//Note: Date class is mostly deprecated but used for assignment anyway
@SuppressWarnings("deprecation")
public class AppointmentServiceTest {
	@DisplayName("Appointment Service can add appointments")
	@Test
	void addAppointment() {
		Date date1 = new Date(3000-1900, 1, 1);
		String description1 = "Initial appointment";
		Date date2 = new Date(3000-1900, 2, 1);
		String description2 = "Follow-up appointment";
		
		AppointmentService testService = new AppointmentService();
		assertTrue(testService.getAppointments().isEmpty()); // check there are no appointments
		
		testService.addAppointment(date1, description1);
		assertEquals(1, testService.getAppointments().size()); // test appointments now has 1 appointment
		assertEquals(date1, testService.getAppointmentByID("0").getDate()); // test matching date
		
		testService.addAppointment(date2, description2);
		assertEquals(2, testService.getAppointments().size()); // test appointments now has 2 appointments
		assertEquals(date2, testService.getAppointmentByID("1").getDate()); // test matching date
	}
	
	
	@DisplayName("Appointment Service can delete appointments")
	@Test
	void deleteAppointment() {
		Date date1 = new Date(3000-1900, 1, 1);
		String description1 = "Initial appointment";
		Date date2 = new Date(3000-1900, 2, 1);
		String description2 = "Follow-up appointment";
		
		AppointmentService testService = new AppointmentService();
		assertTrue(testService.getAppointments().isEmpty()); // check there are no appointments
		
		testService.addAppointment(date1, description1);
		testService.addAppointment(date2, description2);
		assertEquals(2, testService.getAppointments().size()); // test appointments now has 2 appointments
		
		testService.deleteAppointment("1");
		assertEquals(1, testService.getAppointments().size()); // test appointments now has 1 appointment
		assertEquals(date1, testService.getAppointmentByID("0").getDate()); // other test still exists
		assertEquals(null, testService.getAppointmentByID("1")); // test deleted appointment is not returned
	}
}
