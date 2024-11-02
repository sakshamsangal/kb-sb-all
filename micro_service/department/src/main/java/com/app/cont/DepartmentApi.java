package com.app.cont;

import com.app.service.EmployeeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dept")
public class DepartmentApi {

    private final EmployeeClient employeeClient;


    @GetMapping("/all")
    public String getProduct() {
        return employeeClient.welcome();
    }

}
