package org.example.services.impl;

import org.example.dao.AppDB;
import org.example.model.Comment;
import org.example.model.Member;
import org.example.model.Post;
import org.example.services.PostService;

public class PostServiceImpl implements PostService {
    private final AppDB appDB = AppDB.getInstance();
    @Override
    public boolean uploadPost(Member member, String text, byte[] media) {
        Post post = new Post().setText(text).setMedia(media).setMemberPosted(member);
        appDB.addMemberPostMap(member, post);
        return true;
    }

    @Override
    public boolean likePost(Member member, Post post) {
        post.addMemberLiked(member);
        return true;
    }

    @Override
    public boolean commentPost(Member member, Post post, String comment) {
        post.addComment(member, new Comment().setText(comment));
        return true;
    }
}
