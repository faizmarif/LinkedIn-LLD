package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Post {
    private Member memberPosted;
    private String text;
    private byte[] media;
    private Map<Member, List<Comment>> memberCommentMap;
    private List<Member> memberLiked;

    public String getText() {
        return text;
    }

    public Post setText(String text) {
        this.text = text;
        return this;
    }

    public byte[] getMedia() {
        return media;
    }

    public Post setMedia(byte[] media) {
        this.media = media;
        return this;
    }

    public Map<Member, List<Comment>> getComments() {
        return memberCommentMap;
    }

    public Post addComment(Member member, Comment comment) {
        if (this.memberCommentMap == null) {
            this.memberCommentMap = new HashMap<>();
        }
        if(!memberCommentMap.containsKey(member)) {
            memberCommentMap.put(member, new ArrayList<>());
        }
        memberCommentMap.get(member).add(comment);
        return this;
    }

    public List<Member> getMemberLiked() {
        return memberLiked;
    }

    public Post addMemberLiked(Member memberLiked) {
        if (this.memberLiked == null) {
            this.memberLiked = new ArrayList<>();
        }
        this.memberLiked.add(memberLiked);
        return this;
    }

    public Member getMemberPosted() {
        return memberPosted;
    }

    public Post setMemberPosted(Member memberPosted) {
        this.memberPosted = memberPosted;
        return this;
    }
}
