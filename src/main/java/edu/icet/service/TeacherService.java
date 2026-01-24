package edu.icet.service;

import edu.icet.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {
    void addTeacher(TeacherDTO teacherDTO);
    void updateTeacher(TeacherDTO teacherDTO);
    void deleteTeacher(String id);
    TeacherDTO getTeacherByName(String name);
    List<TeacherDTO>  getAllTeachers();

}
