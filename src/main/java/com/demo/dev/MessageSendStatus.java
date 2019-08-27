package com.demo.dev;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class MessageSendStatus {
    private Status status;
    private LocalDateTime dateSent;
}
