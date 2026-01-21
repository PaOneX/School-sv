package edu.icet.service.Impl;

import edu.icet.dto.StudentDTO;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {


    final StudentRepository repository;
    final ModelMapper mapper;

    @Override
    public void addStudent(StudentDTO studentDTO) {
        StudentEntity studentEntity = mapper.map(studentDTO, StudentEntity.class);
        repository.save(studentEntity);
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        repository.save(mapper.map(studentDTO, StudentEntity.class));
    }

    @Override
    public void deleteStudent(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<StudentDTO> getStudents() {

        List<StudentEntity> studentEntities = repository.findAll();
        ArrayList<StudentDTO> studentDTOs = new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDTO studentDTO = mapper.map(studentEntity, StudentDTO.class);
            studentDTOs.add(studentDTO);
        });
        return studentDTOs;

    }

    @Override
    public StudentDTO getStudentsById(Integer id) {

        StudentEntity studentEntity = repository.findById(id).get();
        StudentDTO studentDTO = mapper.map(studentEntity, StudentDTO.class);
        return studentDTO;

    }


}
