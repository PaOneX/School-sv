package edu.icet.service.Impl;

import edu.icet.dto.ClassDTO;
import edu.icet.entity.ClassEntity;
import edu.icet.repository.ClassRepository;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    private final ClassRepository repo;
    private final ModelMapper mapper;

    @Override
    public void addClass(ClassDTO classDTO) {
        repo.save(mapper.map(classDTO, ClassEntity.class));
    }

    @Override
    public void updateClass(ClassDTO classDTO) {
        repo.save(mapper.map(classDTO, ClassEntity.class));

    }

    @Override
    public void deleteClass(Integer id) {
            repo.deleteById(id);
    }

    @Override
    public List<ClassDTO> getAllClasses() {
        List<ClassEntity> classEntities = repo.findAll();
        ArrayList<ClassDTO> classDTOS = new ArrayList<>();
        classEntities.forEach(classEntity -> {
            ClassDTO classDTO = mapper.map(classEntity, ClassDTO.class);
            classDTOS.add(classDTO);
        });
        return classDTOS;
    }

    @Override
    public ClassDTO getClassById(Integer id) {
        ClassEntity classEntity = repo.findById(id)
                .orElseThrow(()-> new RuntimeException("Class not found with id: " + id));
        return mapper.map(classEntity, ClassDTO.class);
    }

    @Override
    public ClassDTO getClassByName(String name) {
        ClassEntity classEntity =repo.findClassByName(name);
        return mapper.map(classEntity, ClassDTO.class);

    }
}
