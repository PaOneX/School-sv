package edu.icet.service;

import edu.icet.dto.SchoolDTO;

import java.util.List;

public interface SchoolService {

    void addSchool(SchoolDTO schoolDTO);
    void updateSchool(SchoolDTO schoolDTO);
    void deleteSchool(Integer id);
    List<SchoolDTO> getAllSchools();
    SchoolDTO searchByName(String name);
}
