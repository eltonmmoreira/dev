package com.demo.dev;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.LocalDateTime;

@Service
public class MessageriaServiceImpl implements MessageriaService {

    @Override
    public MessageSendStatus send(Message message) {
        Assert.notNull(message.getFrom(), "From not informed");
        Assert.notNull(message.getTo(), "To not informed");

        System.out.println("Message sent successfully");
        return MessageSendStatus.builder()
                .status(Status.SEND)
                .dateSent(LocalDateTime.now())
                .build();
    }
}
