package org.example.services;

import org.example.model.Member;

public interface ProfileService {
    boolean addExperience(Member member, String title, String company);
    boolean addEducation(Member member, String school, String degree);
    boolean addSkill(Member member, String name, String level);
}
