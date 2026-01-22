package edu.icet.controller;

import edu.icet.dto.StudentDTO;
import edu.icet.dto.ToDo;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {

    final RestTemplate restTemplate;
    final StudentService studentService;

    @GetMapping("/get-todo/{id}")
    public ToDo getToDo(@PathVariable Integer id){
        String url = "https://dummyjson.com/quotes/"+id;

        ToDo forObject = restTemplate.getForObject(url, ToDo.class);
        return forObject;
    }

    @GetMapping("/get-todo")
    public ToDo[] getTodos(){
        String url = "https://dummyjson.com/quotes/";

        ToDo[] forObject = restTemplate.getForObject(url, ToDo[].class);
        return forObject;
    }

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
