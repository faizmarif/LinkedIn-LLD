package org.example.services.impl;

import org.example.model.Company;
import org.example.model.Member;
import org.example.services.FollowService;

public class FollowServiceImpl implements FollowService {
    @Override
    public boolean followCompany(Member member, Company company) {
        company.addFollower(member);
        return true;
    }

    @Override
    public boolean unfollowCompany(Member member, Company company) {
        return company.getFollowers().remove(member);
    }

    @Override
    public boolean sendConnectionRequest(Member fromRequest, Member toRequest) {
        // TODO
        return false;
    }


    /*

    a -> b,c
    b -> a,c
    c -> a
       a  b  c
    a  0  1  1
    b
    c  0

     */
}
