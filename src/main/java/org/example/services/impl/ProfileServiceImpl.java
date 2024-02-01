package org.example.services.impl;

import org.example.model.Education;
import org.example.model.Experience;
import org.example.model.Member;
import org.example.model.Skill;
import org.example.services.ProfileService;

public class ProfileServiceImpl implements ProfileService {
    @Override
    public boolean addExperience(Member member, String title, String company) {
        Experience experience = new Experience().setTitle(title).setCompany(company);
        member.getProfile().addExperience(experience);
        return true;
    }

    @Override
    public boolean addEducation(Member member, String school, String degree) {
        Education education = new Education().setSchool(school).setDegree(degree);
        member.getProfile().addEducation(education);
        return true;
    }

    @Override
    public boolean addSkill(Member member, String name, String level) {
        Skill skill = new Skill().setName(name).setLevel(level);
        member.getProfile().addSkill(skill);
        return true;
    }
}
