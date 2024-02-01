package org.example.services;

import org.example.model.Company;
import org.example.model.JobPosting;
import org.example.model.Member;

import java.util.List;

public interface SearchService {
    List<Member> searchMember(String name);
    List<Company> searchCompany(String name);
    List<JobPosting> searchJob(String jobTitle);
}
