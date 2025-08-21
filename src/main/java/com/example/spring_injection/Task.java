package com.example.spring_injection;

import java.time.LocalDate;

public class Task {
    private String description;
    private LocalDate dueDate;

    public Task() {
        // Default constructor
    }

    public Task(String description, LocalDate dueDate) {
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = LocalDate.parse(dueDate);
    }

    /*public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }*/

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
