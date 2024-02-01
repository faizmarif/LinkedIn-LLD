package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Member groupAdmin;
    private List<Member> groupMembers;

    public String getName() {
        return name;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }

    public Member getGroupAdmin() {
        return groupAdmin;
    }

    public Group setGroupAdmin(Member groupAdmin) {
        this.groupAdmin = groupAdmin;
        return this;
    }

    public List<Member> getGroupMembers() {
        return groupMembers;
    }

    public Group addGroupMember(Member groupMember) {
        if (this.groupMembers == null) {
            this.groupMembers = new ArrayList<>();
        }
        this.groupMembers.add(groupMember);
        return this;
    }
}
