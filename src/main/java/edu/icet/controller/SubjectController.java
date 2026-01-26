package edu.icet.controller;

import edu.icet.dto.SubjectDTO;
import edu.icet.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;

    @GetMapping("/get-all-subject")
    public List<SubjectDTO> getAllSubject(){
        return subjectService.getAllSubjects();
    }

    @GetMapping ("/get-subject-by-id/{id}")
    public SubjectDTO getSubjectById(@PathVariable Integer id){
        return  subjectService.getSubjectById(id);
    }

    @GetMapping ("/get-subject-by-name/{name}")
    public SubjectDTO getSubjectByName(@PathVariable String name){
        return  subjectService.getSubjectByName(name);
    }

    @PostMapping("/add-Subject")
    public void addSubject(@RequestBody SubjectDTO subjectDTO){
        subjectService.addSubject(subjectDTO);
    }

    @PutMapping("/update-subject")
    public void updateSubject(@RequestBody SubjectDTO subjectDTO){
        subjectService.updateSubject(subjectDTO);
    }

}
