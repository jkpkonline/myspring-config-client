package com.jk.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Value("${jk}")
    String name;

    @GetMapping("/env")
    public String getEnv() {
        return name;
    }
}
