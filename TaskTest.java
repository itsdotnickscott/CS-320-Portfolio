/******************************************************************************

TaskTest.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 7/31/2026

*******************************************************************************/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TaskTest {
	@DisplayName("Task constructor is valid")
	@Test
	void testTaskConstructor() {
		String taskID = "0";
		String name = "Module 4 Assignment";
		String description = "Complete java classes and unit tests";
		
		Task testTask = new Task(taskID, name, description);
		
		// test all info of task matches
		assertEquals(taskID, testTask.getTaskID());
		assertEquals(name, testTask.getName());
		assertEquals(description, testTask.getDescription());
	}
	
	
	@DisplayName("Task ID cannot be null")
	@Test
	void testNullTaskID() {
		String taskID = null;
		String name = "Module 4 Assignment";
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(taskID, name, description);
		});
	}
	
	
	@DisplayName("Name cannot be null")
	@Test
	void testNullName() {
		String taskID = "0";
		String name = null;
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(taskID, name, description);
		});
	}
	
	
	@DisplayName("Description cannot be null")
	@Test
	void testNullDescription() {
		String taskID = "0";
		String name = "Module 4 Assignment";
		String description = null;
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(taskID, name, description);
		});
	}
	
	
	@DisplayName("Task ID cannot be longer than 10 characters")
	@Test
	void testLengthyTaskID() {
		String taskID = "xxxxxxxxxxxxxx";
		String name = "Module 4 Assignment";
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(taskID, name, description);
		});
	}
	
	
	@DisplayName("Name cannot be longer than 20 characters")
	@Test
	void testLengthyName() {
		String taskID = "0";
		String name = "xxxxxxxxxxxxxxxxxxxxxxxxxxxx";
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(taskID, name, description);
		});
	}
	
	
	@DisplayName("Description cannot be longer than 50 characters")
	@Test
	void testLengthyDescription() {
		String taskID = "0";
		String name = "Module 4 Assignment";
		String description = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(taskID, name, description);
		});
	}
	
	
	@DisplayName("Task ID cannot be empty")
	@Test
	void testEmptyTaskID() {
		String taskID = "";
		String name = "Module 4 Assignment";
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(taskID, name, description);
		});
	}
	
	
	@DisplayName("Name cannot be empty")
	@Test
	void testEmptyName() {
		String taskID = "0";
		String name = "";
		String description = "Complete java classes and unit tests";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(taskID, name, description);
		});
	}
	
	
	@DisplayName("Description cannot be empty")
	@Test
	void testEmptyDescription() {
		String taskID = "0";
		String name = "Module 4 Assignment";
		String description = "";
		
		// test exception is thrown
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(taskID, name, description);
		});
	}
	
	
	@DisplayName("Name and description can be updated")
	@Test
	void testTaskSetters() {
		String taskID = "0";
		String name = "Module 4 Assignment";
		String description = "Complete java classes and unit tests";
		
		Task testTask = new Task(taskID, name, description);
		
		// test name and description matches
		assertEquals(name, testTask.getName());
		assertEquals(description, testTask.getDescription());
		
		String newName = "Groceries";
		String newDescription = "Milk eggs sugar butter flour";
		
		testTask.setName(newName);
		testTask.setDescription(newDescription);
		
		// test name and description properly updated
		assertEquals(newName, testTask.getName());
		assertEquals(newDescription, testTask.getDescription());
	}
}
