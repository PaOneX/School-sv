package edu.icet.repository;

import edu.icet.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassEntity,Integer> {
    ClassEntity findClassByName(String name);
}
