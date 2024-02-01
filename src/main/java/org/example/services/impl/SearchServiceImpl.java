package org.example.services.impl;

import org.example.dao.AppDB;
import org.example.model.Company;
import org.example.model.JobPosting;
import org.example.model.Member;
import org.example.services.SearchService;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    private final AppDB appDB = AppDB.getInstance();

    @Override
    public List<Member> searchMember(String name) {
        List<Member> result = new ArrayList<>();
        List<Member> allMembers = appDB.getMembers(); // need to optimise
        for(Member m : allMembers) {
            if(m.getProfile().getPerson().getName().matches(name)) {
                result.add(m);
            }
        }
        return result;
    }

    @Override
    public List<Company> searchCompany(String name) {
        List<Company> result = new ArrayList<>();
        List<Company> allCompanies = appDB.getCompanies(); // need to optimise
        for(Company c : allCompanies) {
            if(c.getName().matches(name)) {
                result.add(c);
            }
        }
        return result;
    }

    @Override
    public List<JobPosting> searchJob(String jobTitle) {
        List<JobPosting> result = new ArrayList<>();
        List<JobPosting> allJobPostings = appDB.getCompanyJobMap().values().stream()
                .flatMap(List::stream)
                .toList();

        for (JobPosting jb : allJobPostings) {
            if(jb.getTitle().matches(jobTitle)) {
                result.add(jb);
            }
        }
        return result;
    }
}
