package com.example.backend.api;

import com.example.backend.model.Calculate;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    @PostMapping("/toy/add")
    public int addResult(@RequestParam("num1")int num1, @RequestParam("num2")int num2, Model model) {
    int result = num1 + num2;
    return result;
    }

}
