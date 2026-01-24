package edu.icet.repository;

import edu.icet.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<SchoolEntity,Integer> {

    SchoolEntity findBySchoolNameContainingIgnoreCase(String name);
}
