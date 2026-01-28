package edu.icet.service;

import edu.icet.dto.GuardianDTO;

import java.util.List;

public interface GuardianService {
    void addGuardian(GuardianDTO guardianDTO);
    void updateGuardian(GuardianDTO guardianDTO);
    void deleteGuardian (Integer id);
    List<GuardianDTO> getAllGuardian();
    GuardianDTO getGuardianById(Integer id);

}
