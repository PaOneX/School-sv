package edu.icet.controller;

import edu.icet.dto.SchoolDTO;
import edu.icet.dto.StudentDTO;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping("/add-school")
    public void addStudent(@RequestBody SchoolDTO studentDTO) {
        schoolService.addSchool(studentDTO);
    }

    @PutMapping("/update-school")
    public void updateStudent(@RequestBody SchoolDTO studentDTO) {
        schoolService.updateSchool(studentDTO);
    }

    @DeleteMapping("/delete-school/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        schoolService.deleteSchool(id);
    }

    @GetMapping("/search/{name}")
    public SchoolDTO searchSchool(@PathVariable String name) {
        return schoolService.searchByName(name);
    }

    @GetMapping("/getAll-school")
    public List<SchoolDTO> getAllStudents() {
        return schoolService.getAllSchools();
    }

}
