package com.app.shared.exception;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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
