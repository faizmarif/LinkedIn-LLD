package org.example.services.impl;

import org.example.model.Member;
import org.example.model.Message;
import org.example.services.MessageService;

public class MessageServiceImpl implements MessageService {
    @Override
    public boolean sendMessage(Member sender, Member receiver, String msg) {
        receiver.addMessage(sender, new Message().setText(msg));
        return true;
    }
}
