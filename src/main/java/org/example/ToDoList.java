package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> toDoList = new ArrayList<>();

    //Methods that are needed = Add, Remove, Update, Show List
    public void addTask(Task task) {
        toDoList.add(task);
    }
    public void removeTask(Task task) {
        toDoList.remove(task);
    }
    public void updateTask(Task oldTask, Task newTask) {
        int index = toDoList.indexOf(oldTask);
        if (index != -1) {
            toDoList.set(index, newTask);
        } else {
            System.out.println("Task not found in the list.");
        }
    }
    public List<Task> getToDoList() {
        return toDoList;
    }
}
