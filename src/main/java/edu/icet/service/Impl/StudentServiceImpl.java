package edu.icet.service.Impl;

import edu.icet.dto.StudentDTO;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {


    final StudentRepository repository;
    final ModelMapper mapper;
    @Override
    public void addStudent(StudentDTO studentDTO) {
        StudentEntity studentEntity = mapper.map(studentDTO,StudentEntity.class);
        repository.save(studentEntity);
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {

    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public List<StudentDTO> getStudents() {
        return List.of();
    }

    @Override
    public List<StudentDTO> getStudentsByName(String name) {
        return List.of();
    }
}
