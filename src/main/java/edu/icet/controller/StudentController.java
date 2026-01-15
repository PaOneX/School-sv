package edu.icet.controller;

import edu.icet.service.StudentService;
import edu.icet.service.StudentServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/name")
     String getName(){

        return studentService.getName();
    }

    @GetMapping("/version")
    String getVersion(){
        return studentService.getVersion();
    }
}
