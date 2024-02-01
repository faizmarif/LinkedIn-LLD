package org.example.services;

import org.example.model.Member;
import org.example.model.Post;

public interface PostService {
    boolean uploadPost(Member member, String text, byte[] media);
    boolean likePost(Member member, Post post);
    boolean commentPost(Member member, Post post, String comment);
}
