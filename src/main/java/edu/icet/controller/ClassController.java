package edu.icet.controller;

import edu.icet.dto.ClassDTO;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClassController {

    private final ClassService service;


    @GetMapping("/get-all-class")
    public List<ClassDTO> getAllClasses(){
        return service.getAllClasses();
    }

    @GetMapping("/serch-By-Id/{id}")
    public ClassDTO serchById(@PathVariable int id){
        return service.getClassById(id);
    }

    @GetMapping("/serch-By-Name/{name}")
    public ClassDTO serchByName(@PathVariable String name){
        return service.getClassByName(name);
    }

    @PostMapping("/add-class")
    public void addClass(@RequestBody ClassDTO classDTO){
        service.addClass(classDTO);
    }

    @PostMapping("/update-class")
    public void updateClass(@RequestBody ClassDTO classDTO){
        service.updateClass(classDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteClass(@PathVariable int id){
        service.deleteClass(id);
    }
}
