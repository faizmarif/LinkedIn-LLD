package org.example.model;

public class JobPosting {
    private Company company;
    private String title;
    private String description;
    private boolean isFulfilled;

    public String getTitle() {
        return title;
    }

    public JobPosting setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public JobPosting setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isFulfilled() {
        return isFulfilled;
    }

    public JobPosting setFulfilled(boolean fulfilled) {
        isFulfilled = fulfilled;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public JobPosting setCompany(Company company) {
        this.company = company;
        return this;
    }
}
