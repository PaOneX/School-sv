package edu.icet.controller;

import edu.icet.dto.TeacherDTO;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping("/add-tearcher")
    public void  addTeacher(@RequestBody TeacherDTO teacherDTO){
        teacherService.addTeacher(teacherDTO);
    }

    @PutMapping("/update-tearcher")
    public void  updateTeacher(@RequestBody TeacherDTO teacherDTO){
        teacherService.updateTeacher(teacherDTO);
    }

    @DeleteMapping("/delete-teacher/{id}")
    public void deleteTeacher(@PathVariable int id){
        teacherService.deleteTeacher(id);
    }

    @GetMapping("/get-all-tearcher")
    public List<TeacherDTO> getAllTeacher(){
        return teacherService.getAllTeachers();
    }

    @GetMapping("/search-teacher-by-name/{name}")
    public TeacherDTO teacherName(@PathVariable String name){
        return teacherService.getTeacherByName(name);
    }

}
