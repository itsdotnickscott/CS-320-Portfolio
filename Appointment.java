/******************************************************************************

Appointment.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 8/9/2026

*******************************************************************************/

import java.util.Date;


public class Appointment {
	// Class attributes
	private String appointmentID;
	private Date date;
	private String description;
	
	
	// Constructor
	public Appointment(String appointmentID, Date date, String description) {
		checkAppointmentID(appointmentID);
		this.appointmentID = appointmentID;
		
		setDate(date);
		setDescription(description);
	}
	
	
	// Validator functions
	public void checkAppointmentID(String appointmentID) {
		// appointment id can neither be null, empty, nor be longer than 10 characters
		if (appointmentID == null || appointmentID.length() > 10 || appointmentID.isEmpty()) {
			throw new IllegalArgumentException("Invalid task ID");
		}
	}
	
	
	public void checkDate(Date date) {
		// date can neither be null nor be in the past
		if (date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invalid date");
		}
	}
	
	
	public void checkDescription(String description) {
		// description can neither be null, empty, nor be longer than 50 characters
		if (description == null || description.length() > 50 || description.isEmpty()) {
			throw new IllegalArgumentException("Invalid task ID");
		}
	}
	
	
	// Accessor functions
	public String getAppointmentID() {
		return appointmentID;
	}
	
	
	public Date getDate() {
		return date;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	
	// Mutator functions
	// Note: no setter exists for appointment ID, can only be set once through the constructor
	public void setDate(Date date) {
		checkDate(date);
		this.date = date;
	}
	
	
	public void setDescription(String description) {
		checkDescription(description);
		this.description = description;
	}
}
