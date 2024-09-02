package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
    public void removeTask(Task task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
        } else {
            System.out.println("Task not found");
        }
    }

    public void printTaskList() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void completeTask(Task task) {
        if (tasks.contains(task)) {
            task.setCompleted(true);
            System.out.println("Task marked as completed");
        } else {
            System.out.println("Task not found");
        }
    }
}
