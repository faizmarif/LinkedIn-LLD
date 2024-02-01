package org.example.model;

public class Skill {
    private String name;
    private String level;

    public String getName() {
        return name;
    }

    public Skill setName(String name) {
        this.name = name;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public Skill setLevel(String level) {
        this.level = level;
        return this;
    }
}
