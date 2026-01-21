package edu.icet.controller;

import edu.icet.dto.StudentDTO;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {


    final StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDTO studentDTO) {
        studentService.addStudent(studentDTO);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDTO studentDTO) {
        studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("/search/{id}")
    public StudentDTO searchStudent(@PathVariable Integer id) {
        return studentService.getStudentsById(id);
    }

    @GetMapping("/getAll")
    public List<StudentDTO> getAllStudents() {
        return studentService.getStudents();
    }

}
