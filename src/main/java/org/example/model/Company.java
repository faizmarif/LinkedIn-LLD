package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String detail;
    private List<Member> followers;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public Company setName(String name) {
        this.name = name;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public Company setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public List<Member> getFollowers() {
        return followers;
    }

    public Company addFollower(Member follower) {
        if (this.followers == null) {
            this.followers = new ArrayList<>();
        }
        this.followers.add(follower);
        return this;
    }
}
