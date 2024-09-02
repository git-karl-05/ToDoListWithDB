package org.example;

public class Task {
    private String name;
    private String description;
    private boolean isCompleted;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.isCompleted = false;
    }

    public Task(String name) {
        this.name = name;
        this.description = "N/A";
        this.isCompleted = false;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }



    @Override
    public String toString() {
        return "{Task Name = " + name + ", Description = " + description + ", " +
                "Completed? = " + isCompleted + '}';
    }
}
