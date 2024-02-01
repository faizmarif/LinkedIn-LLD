package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private Person person;
    private List<Education> educations;
    private List<Experience> experiences;
    private List<Skill> skills;

    public Person getPerson() {
        return person;
    }

    public Profile setPerson(Person person) {
        this.person = person;
        return this;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public Profile addEducation(Education education) {
        if (this.educations == null) {
            this.educations = new ArrayList<>();
        }
        this.educations.add(education);
        return this;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public Profile addExperience(Experience experience) {
        if (this.experiences == null) {
            this.experiences = new ArrayList<>();
        }
        this.experiences.add(experience);
        return this;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public Profile addSkill(Skill skill) {
        if (this.skills == null) {
            this.skills = new ArrayList<>();
        }
        this.skills.add(skill);
        return this;
    }
}
