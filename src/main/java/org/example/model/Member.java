package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Member {
    private Profile profile;
    private List<Member> connections;
    private List<Company> companiesFollowing;
    private Map<Member, List<Message>> senderMsgMap;


    public Profile getProfile() {
        return profile;
    }

    public Member setProfile(Profile profile) {
        this.profile = profile;
        return this;
    }

    public List<Member> getConnections() {
        return connections;
    }

    public Member addConnection(Member connection) {
        if (this.connections == null) {
            this.connections = new ArrayList<>();
        }
        this.connections.add(connection);
        return this;
    }

    public List<Company> getCompaniesFollowing() {
        return companiesFollowing;
    }

    public Member addCompaniesFollowing(Company companiesFollowing) {
        if (this.companiesFollowing == null) {
            this.companiesFollowing = new ArrayList<>();
        }
        this.companiesFollowing.add(companiesFollowing);
        return this;
    }

    public Map<Member, List<Message>> getSenderMsgMap() {
        return senderMsgMap;
    }

    public Member addMessage(Member member, Message message) {
        if(senderMsgMap == null){
            senderMsgMap = new HashMap<>();
        }
        if(!senderMsgMap.containsKey(member)) {
            senderMsgMap.put(member, new ArrayList<>());
        }
        senderMsgMap.get(member).add(message);
        return this;
    }
}
