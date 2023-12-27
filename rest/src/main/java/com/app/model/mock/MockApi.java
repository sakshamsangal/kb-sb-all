package com.app.model.mock;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class MockApi {


    private final FileName fileName;

    @GetMapping("/mock")
    public String welcome() {
        if (fileName.fn.equals("1")) {
            return "success";
        }
        return "cat";
    }

    @GetMapping("/var/{status}")
    public String welcome1(@PathVariable String status) {
        if (status.equals("1")) {
            fileName.fn = "1";
            return "success";
        }
        fileName.fn = "2";
        return "success";

    }
}
