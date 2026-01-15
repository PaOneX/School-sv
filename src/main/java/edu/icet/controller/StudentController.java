package edu.icet.controller;

import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {


    StudentService studentService;


}
