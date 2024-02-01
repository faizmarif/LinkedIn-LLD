package org.example.dao;

import org.example.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppDB {
    private static AppDB appDB = null;
    private List<Member> members;
    private List<Company> companies;
    private Map<Company, List<JobPosting>> companyJobMap;
    private Map<Member, List<Post>> memberPostMap;
    
    private AppDB() {}
    
    public static AppDB getInstance() {
        if(appDB == null) {
            appDB = new AppDB();
        }
        return appDB;
    }

    public List<Member> getMembers() {
        return members;
    }

    public AppDB addMember(Member member) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(member);
        return this;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public AppDB addCompany(Company company) {
        if (this.companies == null) {
            this.companies = new ArrayList<>();
        }
        this.companies.add(company);
        return this;
    }

    public Map<Company, List<JobPosting>> getCompanyJobMap() {
        return companyJobMap;
    }

    public AppDB addCompanyJobMap(Company company, JobPosting jobPosting) {
        if (this.companyJobMap == null) {
            this.companyJobMap = new HashMap<>();
        }
        if(!companyJobMap.containsKey(company)) {
            companyJobMap.put(company, new ArrayList<>());
        }
        companyJobMap.get(company).add(jobPosting);
        return this;
    }

    public Map<Member, List<Post>> getMemberPostMap() {
        return memberPostMap;
    }

    public AppDB addMemberPostMap(Member member, Post post) {
        if (this.memberPostMap == null) {
            this.memberPostMap = new HashMap<>();
        }
        if(!memberPostMap.containsKey(member)) {
            memberPostMap.put(member, new ArrayList<>());
        }
        memberPostMap.get(member).add(post);
        return this;
    }
}
