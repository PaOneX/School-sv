package edu.icet.service.Impl;

import edu.icet.dto.SubjectDTO;
import edu.icet.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    @Override
    public void addSubject(SubjectDTO subjectDTO) {

    }

    @Override
    public void updateSubject(SubjectDTO subjectDTO) {

    }

    @Override
    public void deleteSubject(Integer id) {

    }

    @Override
    public List<SubjectDTO> getAllSubjects() {
        return List.of();
    }

    @Override
    public SubjectDTO getSubjectById(Integer id) {
        return null;
    }

    @Override
    public SubjectDTO getSubjectByNmae(String name) {
        return null;
    }
}
