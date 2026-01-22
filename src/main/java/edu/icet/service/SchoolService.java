package edu.icet.service;

import edu.icet.dto.SchoolDTO;

import java.util.List;

public interface SchoolService {

    void addSchool(SchoolService schoolService);
    void updateSchool(SchoolService schoolService);
    void searchSchool(Integer id);
    List<SchoolDTO> getAllSchools();
    SchoolDTO searchByName(String name);
}
