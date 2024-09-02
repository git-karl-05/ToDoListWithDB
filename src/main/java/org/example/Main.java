package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList taskList = new ToDoList();

        System.out.println("Welcome to your " + "To-Do List!");
        System.out.println("Available commands: Add, Remove, List, Complete, Exit");



        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine().trim();
            String[] commandParts = command.split(" ", 2);
            String action = commandParts[0];

            switch (action.toLowerCase()) {
                case "add":
                    if (commandParts.length > 1) {
                        Task task = new Task(commandParts[1]);
                        taskList.addTask(task);
                        System.out.println("Task added: " + task.getName());
                    } else {
                        System.out.println("Add [task name]");
                    }
                    break;
                case "remove":
                    if (commandParts.length > 1) {
                        Task taskToRemove = findTaskByName(taskList, commandParts[1]);
                        if (taskToRemove != null) {
                            taskList.removeTask(taskToRemove);
                            System.out.println("Task removed: " + taskToRemove.getName());
                        } else {
                            System.out.println("Task not found: " + commandParts[1]);
                        }
                    } else {
                        System.out.println("Remove [task name]");
                    }
                    break;
                case "list":
                    taskList.printTaskList();
                    break;
                case "complete":
                    if (commandParts.length > 1) {
                        Task taskToComplete = findTaskByName(taskList, commandParts[1]);
                        if (taskToComplete != null) {
                            taskList.completeTask(taskToComplete);
                            System.out.println("Task completed: " + taskToComplete.getName());
                        } else {
                            System.out.println("Task not found: " + commandParts[1]);
                        }
                    } else{
                        System.out.println("Complete [task name]");
                    }
                    break;
                case "update":
                    if (commandParts.length <= 1) {
                        System.out.println("Update [task name] - [description]");
                        break;
                    }

                    String[] updateParts = commandParts[1].split("-", 2);

                    Task taskToUpdate = findTaskByName(taskList, commandParts[0]);

                    if (taskToUpdate != null) {
                        System.out.println("Task not found: " + updateParts[0]);
                        break;
                    }

                    String[] details = updateParts[1].split("=", 2);


                    if (details.length <= 1) {
                        System.out.println("Invalid format. Use: Update [task name] " +
                                "[field]=[value]");
                        break;
                    }

                    String field = details[0].toLowerCase();
                    String value = details[1];

                    switch (field) {
                        case "name":
                            taskToUpdate.setName(value);
                            System.out.println("Task name updated to: " + value);
                            break;
                        case "description":
                            taskToUpdate.setDescription(value);
                            System.out.println("Task description updated to: " + value);
                            break;
                        default:
                            System.out.println("Invalid field: " + field);
                            break;

                    }
                    break;

                case "exit":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command. Available commands: Add, Remove, List, Complete, Exit");
                    break;


            }
        }
    }
    public static Task findTaskByName(ToDoList taskList, String taskName) {
        for (Task task : taskList.getTasks()) {
            if (task.getName().equalsIgnoreCase(taskName))
                return task;
        }
        return null;
    }
}