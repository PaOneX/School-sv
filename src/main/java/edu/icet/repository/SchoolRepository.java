package edu.icet.repository;

import edu.icet.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<SchoolEntity,Integer> {
}
