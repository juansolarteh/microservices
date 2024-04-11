package com.micro.backOffice.hiring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hiringFields")
public class hiringFieldsController {
    @GetMapping("{bool}")
    public ResponseEntity<String> get(@PathVariable boolean bool){
        if (bool)
            throw new UnsupportedOperationException("this is a message test");
        return new ResponseEntity<>("Hola desde hiringFieldsController", HttpStatus.OK);
    }
}
