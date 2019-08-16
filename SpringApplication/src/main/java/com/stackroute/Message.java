package com.stackroute;

import org.springframework.stereotype.Component;

@Component
public class Message
{
    private String message = "This is general Message.";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}