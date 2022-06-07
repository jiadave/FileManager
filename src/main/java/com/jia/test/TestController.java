package com.jia.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/index")
    public String index() {
        return "Hello, Jia";
    }

    @GetMapping(value = "/writeToFile")
    public void writeToFile() {
        FileManager fileManager = new FileManager();
        fileManager.writeToFile("jia.txt");
    }
}