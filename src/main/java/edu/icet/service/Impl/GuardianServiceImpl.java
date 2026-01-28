package edu.icet.service.Impl;

import edu.icet.dto.GuardianDTO;
import edu.icet.entity.GuardianEntity;
import edu.icet.repository.GuardianRepository;
import edu.icet.service.GuardianService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class GuardianServiceImpl implements GuardianService {

    private final GuardianRepository repository;
    private final ModelMapper mapper;
    @Override
    public void addGuardian(GuardianDTO guardianDTO) {
        repository.save(mapper.map(guardianDTO, GuardianEntity.class));
    }

    @Override
    public void updateGuardian(GuardianDTO guardianDTO) {
        repository.save(mapper.map(guardianDTO, GuardianEntity.class));

    }

    @Override
    public void deleteGuardian(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<GuardianDTO> getAllGuardian() {
        List<GuardianEntity> guardianEntities = repository.findAll();
        ArrayList<GuardianDTO> guardianDTOS = new ArrayList<>();
        guardianEntities.forEach(guardianEntity -> {
            GuardianDTO guardianDTO = mapper.map(guardianEntity, GuardianDTO.class);
            guardianDTOS.add(guardianDTO);
        });
        return guardianDTOS;
    }

    @Override
    public GuardianDTO getGuardianById(Integer id) {
        GuardianEntity guardianEntity = repository.findById(id).get();
        GuardianDTO guardianDTO = mapper.map(guardianEntity, GuardianDTO.class);
        return guardianDTO;
    }
}
