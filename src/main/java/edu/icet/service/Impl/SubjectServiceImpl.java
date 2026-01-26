package edu.icet.service.Impl;

import edu.icet.dto.SubjectDTO;
import edu.icet.entity.SubjectEntity;
import edu.icet.repository.SubjectRepository;
import edu.icet.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    final SubjectRepository repository;
    final ModelMapper mapper;

    @Override
    public void addSubject(SubjectDTO subjectDTO) {
        repository.save(mapper.map(subjectDTO, SubjectEntity.class));
    }

    @Override
    public void updateSubject(SubjectDTO subjectDTO) {
        repository.save(mapper.map(subjectDTO, SubjectEntity.class));

    }

    @Override
    public void deleteSubject(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<SubjectDTO> getAllSubjects() {

        List<SubjectEntity> subjectEntities = repository.findAll();
        ArrayList<SubjectDTO> subjectDTOS = new ArrayList<>();
       subjectEntities.forEach(subjectEntity->{
           SubjectDTO subjectDTO = mapper.map(subjectEntity, SubjectDTO.class);
           subjectDTOS.add(subjectDTO);

       });
       return subjectDTOS;

    }

    @Override
    public SubjectDTO getSubjectById(Integer id) {
        SubjectEntity subjectEntity = repository.findById(id).get();
       return mapper.map(subjectEntity, SubjectDTO.class);
    }

    @Override
    public SubjectDTO getSubjectByName(String name) {
        SubjectEntity subjectEntity = repository.findSubjectByName(name);
        return mapper.map(subjectEntity, SubjectDTO.class);
    }
}
