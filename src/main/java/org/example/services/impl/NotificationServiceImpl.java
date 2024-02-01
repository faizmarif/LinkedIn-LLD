package org.example.services.impl;

import org.example.services.NotificationService;

import java.util.concurrent.CompletableFuture;

public class NotificationServiceImpl implements NotificationService {
    @Override
    public boolean sendNotificationForNewMessage() {
        // TODO
        return true;
    }

    @Override
    public boolean sendNotificationForConnectionInvites() {
        // TODO
        return false;
    }
}
