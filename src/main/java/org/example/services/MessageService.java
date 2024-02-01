package org.example.services;

import org.example.model.Member;

public interface MessageService {
    boolean sendMessage(Member sender, Member receiver, String msg);
}
