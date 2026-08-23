/******************************************************************************

TaskService.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 8/9/2026

*******************************************************************************/

import java.util.HashMap;


public class TaskService {
	// Class attributes
	private int currID = 0;
	private HashMap<String, Task> tasks = new HashMap<String, Task>();
	
	
	public void addTask(String name, String description) {
		Task newTask = new Task(Integer.toString(currID), name, description);
		tasks.put(Integer.toString(currID), newTask);
		currID++;
	}
	
	
	public Task getTaskByID(String taskID) {
		return tasks.get(taskID);
	}
	
	
	public HashMap<String, Task> getTasks() {
		return tasks;
	}
	
	
	public void deleteTask(String taskID) {
		tasks.remove(taskID);
	}
	
	
	public void updateName(String taskID, String name) {
		getTaskByID(taskID).setName(name);
	}
	
	
	public void updateDescription(String taskID, String description) {
		getTaskByID(taskID).setDescription(description);
	}
}
