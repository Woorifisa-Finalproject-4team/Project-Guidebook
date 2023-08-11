package com.example.backend.api;

import com.example.backend.model.Calculate;
import com.example.backend.repository.CalcualteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
// CORS설정을 허용해주기 위한 어노테이션 추가
@CrossOrigin(origins = "http://localhost:5173")
public class AddController {
    private final CalcualteRepository calcualteRepository;

    public AddController(CalcualteRepository calcualteRepository) {
        this.calcualteRepository = calcualteRepository;
    }

    @PostMapping("/toy/add")
    public ResponseEntity<Calculate> addVets(@RequestBody Calculate calculate){
        int result = calculate.getNum1()+calculate.getNum2();
        calculate.setResult(result);
        System.out.println(result);
        calcualteRepository.save(calculate);
        System.out.println(new ResponseEntity<>(calculate, HttpStatus.CREATED));
        return new ResponseEntity<>(calculate, HttpStatus.CREATED);
    }

}
