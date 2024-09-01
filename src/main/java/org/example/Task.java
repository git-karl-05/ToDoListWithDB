package org.example;

public class Task {
    private String taskName;
    private String taskDescription;
    private boolean isCompleted;

    public Task (String taskName) {
        this.taskName = taskName;
        this.taskDescription = "";
        this.isCompleted = false;
    }

    public Task (String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.isCompleted = false;
    }

    //Getter

    public String getName() {
        return taskName;
    }

    public String getDescription() {
        return taskDescription;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
