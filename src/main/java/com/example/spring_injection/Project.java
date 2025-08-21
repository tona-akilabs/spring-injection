package com.example.spring_injection;

import java.util.List;

public class Project {
    private String name;
    private List<String> teamMembers;
    private Task task;

    public Project() {}
    public Project(String name, List<String> teamMembers, Task task) {
        this.name = name;
        this.teamMembers = teamMembers;
        this.task = task;
    }

    public void init() {
        System.out.println("Project initialized after dependencies injected");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public List<String> getTeamMembers() {
        return teamMembers;
    }
    public void setTeamMembers(List<String> teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", teamMembers=" + teamMembers +
                ", task=" + task +
                '}';
    }
}
