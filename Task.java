/******************************************************************************

Task.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 7/31/2026

*******************************************************************************/


public class Task {
	// Class attributes
	private String taskID;
	private String name;
	private String description;
	
	
	// Constructor
	public Task(String taskID, String name, String description) {
		checkTaskID(taskID);
		this.taskID = taskID;
		
		setName(name);
		setDescription(description);
	}
	
	
	// Validator functions
	public void checkTaskID(String taskID) {
		// task id can neither be null, empty, nor be longer than 10 characters
		if (taskID == null || taskID.length() > 10 || taskID.isEmpty()) {
			throw new IllegalArgumentException("Invalid task ID");
		}
	}
	
	
	public void checkName(String name) {
		// name can neither be null, empty, nor longer than 20 characters
		if (name == null || name.length() > 20 || name.isEmpty()) {
			throw new IllegalArgumentException("Invalid name");
		}
	}
	
	
	public void checkDescription(String description) {
		// description can neither be null, empty, nor longer than 50 characters
		if (description == null || description.length() > 50 || description.isEmpty()) {
			throw new IllegalArgumentException("Invalid description");
		}
	}
	
	
	// Accessors
	public String getTaskID() {
		return taskID;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	
	// Mutators
	// Note: no setter exists for task ID, can only be set once through the constructor
	public void setName(String name) {
		checkName(name);
		this.name = name;
	}
	
	
	public void setDescription(String description) {
		checkDescription(description);
		this.description = description;
	}
}
