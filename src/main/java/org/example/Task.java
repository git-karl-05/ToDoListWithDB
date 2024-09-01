package org.example;

public class Task {
    //private fields to store task properties
    private String taskName;
    private String taskDescription;
    private boolean isCompleted;


    //constructor to create a Task with only a name
    public Task (String taskName) {
        this.taskName = taskName;
        this.taskDescription = "";
        this.isCompleted = false;
    }
    //constructor to create a Task with a name and description
    public Task (String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.isCompleted = false;
    }

    //Getter methods
    public String getName() {
        return taskName;
    }
    public String getDescription() {
        return taskDescription;
    }
    public boolean isCompleted() {
        return isCompleted;
    }

    //Setter methods
    public void setName(String taskName) {
        this.taskName = taskName;
    }
    public void setDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
