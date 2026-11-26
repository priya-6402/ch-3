package com.lab;

public class SkillBean {
    private String[] skills;

    public void setSkills(String[] skills) { this.skills = skills; }

    public void display() {
        System.out.println("Injected Skills Array (Length: " + skills.length + "):");
        for (int i = 0; i < skills.length; i++) {
            System.out.println(" [" + (i + 1) + "] " + skills[i]);
        }
    }
}
