package edu.icet.service;

import edu.icet.dto.SubjectDTO;

import java.util.List;

public interface SubjectService {
    void addSubject(SubjectDTO subjectDTO);
    void updateSubject(SubjectDTO subjectDTO);
    void deleteSubject(Integer id);
    List<SubjectDTO> getAllSubjects();
    SubjectDTO getSubjectById(Integer id);
    SubjectDTO getSubjectByName(String name);

}
