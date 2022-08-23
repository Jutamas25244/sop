package com.example.mathservice;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeneratePasswordService {
    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name) {
        int password = (int)(Math.random() * 100000000);
        return "Hi, " + name + "\n" + "Your new password is " + password;
    }
}
