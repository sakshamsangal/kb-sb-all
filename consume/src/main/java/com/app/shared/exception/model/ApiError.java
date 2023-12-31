package com.app.shared.exception.model;

import lombok.*;

import java.util.*;

@Data
public class ApiError {
    private String code;
    private List<String> messages;

    public ApiError() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(String msg) {
        messages.add(msg);
    }



}
