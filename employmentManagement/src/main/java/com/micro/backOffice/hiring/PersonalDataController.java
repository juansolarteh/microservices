package com.micro.backOffice.hiring;

import com.micro.shared.application.EmployeeId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personalData")
public class PersonalDataController {
    @GetMapping
    public ResponseEntity<String> get(){
        EmployeeId.create("1234567");
        return new ResponseEntity<>("Hola desde PersonalDataController", HttpStatus.OK);
    }
}
