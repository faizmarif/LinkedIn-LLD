package org.example.services;

import org.example.model.Company;
import org.example.model.Member;

public interface FollowService {
    boolean followCompany(Member member, Company company);
    boolean unfollowCompany(Member member, Company company);
    boolean sendConnectionRequest(Member fromRequest, Member toRequest);
    //boolean acceptConnectionRequest(Member fromRequest, Member toRequest);
}
