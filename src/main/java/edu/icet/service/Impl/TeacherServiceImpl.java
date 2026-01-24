package edu.icet.service.Impl;

import edu.icet.dto.StudentDTO;
import edu.icet.dto.TeacherDTO;
import edu.icet.entity.TeacherEntity;
import edu.icet.repository.TeacherRepository;
import edu.icet.service.StudentService;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addTeacher(TeacherDTO teacherDTO) {
        teacherRepository.save(modelMapper.map(teacherDTO, TeacherEntity.class));
    }

    @Override
    public void updateTeacher(TeacherDTO teacherDTO) {
        teacherRepository.save(modelMapper.map(teacherDTO, TeacherEntity.class));
    }

    @Override
    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public TeacherDTO getTeacherByName(String name) {
        TeacherEntity teacherEntity = teacherRepository.getTeacherByName(name);
        return modelMapper.map(teacherEntity, TeacherDTO.class);
    }

    @Override
    public List<TeacherDTO> getAllTeachers() {
        return List.of();
    }
}