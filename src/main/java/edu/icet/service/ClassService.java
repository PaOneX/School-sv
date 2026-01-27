package edu.icet.service;

import edu.icet.dto.ClassDTO;

import java.util.List;

public interface ClassService {
    void addClass(ClassDTO classDTO);
    void updateClass(ClassDTO classDTO);
    void deleteClass(Integer id);
    List<ClassDTO> getAllClasses();
    ClassDTO getClassById(Integer id);
    ClassDTO getClassByName(String name);
}
