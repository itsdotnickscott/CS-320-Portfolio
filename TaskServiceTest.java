/******************************************************************************

TaskTest.java

Name: Nick Scott
Course: CS-320
Instructor: Professor Norman
Assignment: Project One
Last Modified: 8/9/2026

*******************************************************************************/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TaskServiceTest {
	@DisplayName("Task Service can add tasks with unique IDs")
	@Test
	void testAddTask() {
		String name1 = "Module 4 Assignment";
		String description1 = "Complete java classes and unit tests";
		String name2 = "Groceries";
		String description2 = "Milk eggs sugar butter flour";
		
		TaskService testService = new TaskService();
		
		assertTrue(testService.getTasks().isEmpty()); // test tasks is empty
		
		testService.addTask(name1, description1);
		
		assertEquals(1, testService.getTasks().size()); // test tasks now has 1 task
		assertEquals(name1, testService.getTaskByID("0").getName()); // test name matches
		assertEquals(description1, testService.getTaskByID("0").getDescription()); // test description matches
		
		testService.addTask(name2, description2);
		assertEquals(2, testService.getTasks().size()); // test tasks now has 2 tasks
		assertEquals(description2, testService.getTaskByID("1").getDescription()); // test description matches
	}
	
	
	@DisplayName("Task Service can delete tasks")
	@Test
	void testDeleteTask() {
		String name1 = "Module 4 Assignment";
		String description1 = "Complete java classes and unit tests";
		String name2 = "Groceries";
		String description2 = "Milk eggs sugar butter flour";
		
		TaskService testService = new TaskService();
		
		assertTrue(testService.getTasks().isEmpty()); // test tasks is empty
		
		testService.addTask(name1, description1);
		testService.addTask(name2, description2);
		assertEquals(2, testService.getTasks().size()); // test tasks now has 2 tasks
		
		testService.deleteTask("1");
		assertEquals(1, testService.getTasks().size()); // test tasks now has 1 task
		assertEquals(name1, testService.getTaskByID("0").getName()); // test name matches non-deleted task
		assertEquals(description1, testService.getTaskByID("0").getDescription()); // test description matches
		assertEquals(null, testService.getTaskByID("1")); // test deleted task is not returned from list
	}
	
	
	@DisplayName("Task Service can update name of a task")
	@Test
	void testUpdateName() {
		String name = "Module 4 Assignment";
		String description = "Complete java classes and unit tests";
		String newName = "Module 3 Assignment";
		
		TaskService testService = new TaskService();
		
		testService.addTask(name, description);
		assertEquals(name, testService.getTaskByID("0").getName()); // test original name
		
		testService.updateName("0", newName);
		assertEquals(newName, testService.getTaskByID("0").getName()); // test changed name
	}
	
	
	@DisplayName("Task Service can update description of a task")
	@Test
	void testUpdateDescription() {
		String name = "Module 4 Assignment";
		String description = "Complete java classes and unit tests";
		String newDescription = "Write journal to reflect on unit tests";
		
		TaskService testService = new TaskService();
		
		testService.addTask(name, description);
		assertEquals(description, testService.getTaskByID("0").getDescription()); // test original description
		
		testService.updateDescription("0", newDescription);
		assertEquals(newDescription, testService.getTaskByID("0").getDescription()); // test changed description
	}
}
