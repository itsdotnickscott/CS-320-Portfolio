/******************************************************************************

AppointmentService.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 8/9/2026

*******************************************************************************/

import java.util.Date;
import java.util.HashMap;


public class AppointmentService {
	// Class attributes
	private int currID = 0;
	private HashMap<String, Appointment> appointments = new HashMap<String, Appointment>();
	
	
	// Adds a new appointment to the Map with a given date and description
	public void addAppointment(Date date, String description) {
		Appointment newAppt = new Appointment(Integer.toString(currID), date, description);
		appointments.put(Integer.toString(currID), newAppt);
		currID++; // increment currID so that each ID is unique
	}
	
	
	// Deletes an appointment from the Map based on its given appointmentID
	public void deleteAppointment(String appointmentID) {
		appointments.remove(appointmentID);
	}
	
	
	// Accessor functions
	public HashMap<String, Appointment> getAppointments() {
		return appointments;
	}
	
	
	public Appointment getAppointmentByID(String appointmentID) {
		return appointments.get(appointmentID);
	}
}
