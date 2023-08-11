package com.example.backend.api;

import com.example.backend.model.Calculate;
import com.example.backend.repository.CalcualteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    private final CalcualteRepository calcualteRepository;


    public AddController(CalcualteRepository calcualteRepository) {
        this.calcualteRepository = calcualteRepository;
    }



    @PostMapping("/toy/add")
    public ResponseEntity<Calculate> addVets(@RequestBody Calculate calculate){
       int result = calculate.getNum1()+calculate.getNum2();
        calculate.setResult(result);
        calcualteRepository.save(calculate);
        System.out.println(new ResponseEntity<>(calculate, HttpStatus.CREATED));
        return new ResponseEntity<>(calculate, HttpStatus.CREATED);
    }

}
