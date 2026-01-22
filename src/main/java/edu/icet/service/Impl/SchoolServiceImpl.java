package edu.icet.service.Impl;

import edu.icet.dto.SchoolDTO;
import edu.icet.entity.SchoolEntity;
import edu.icet.repository.SchoolRepository;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    final ModelMapper modelMapper;

    @Override
    public void addSchool( SchoolDTO schoolDTO) {
        schoolRepository.save(modelMapper.map(schoolDTO,SchoolEntity.class ));
    }

    @Override
    public void updateSchool(SchoolDTO schoolDTO) {
        schoolRepository.save(modelMapper.map(schoolDTO,SchoolEntity.class ));

    }

    @Override
    public void deleteSchool(Integer id) {
    schoolRepository.deleteById(id);
    }

    @Override
    public List<SchoolDTO> getAllSchools() {
        List<SchoolEntity> schoolEntities = schoolRepository.findAll();
        ArrayList<SchoolDTO> schoolDTOArrayList = new ArrayList<>();
        schoolEntities.forEach(SchoolEntity ->{
            SchoolDTO schoolDTO = modelMapper.map(SchoolEntity, SchoolDTO.class);
            schoolDTOArrayList.add(schoolDTO);
        });
        return schoolDTOArrayList;

    }


@Override
    public SchoolDTO searchByName(String name) {
        SchoolEntity schoolEntity = schoolRepository.findBySchoolNameContainingIgnoreCase(name);

        return modelMapper.map(schoolEntity, SchoolDTO.class);
    }

}
