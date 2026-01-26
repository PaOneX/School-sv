package edu.icet.repository;

import edu.icet.dto.SubjectDTO;
import edu.icet.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<SubjectEntity,Integer> {
}
