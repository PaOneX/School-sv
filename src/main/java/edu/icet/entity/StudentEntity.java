package edu.icet.entity;

import edu.icet.util.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer schoolId;
    private String name;
    private String address;
    private String email;
    private String phone;
    private Integer age;
    private Gender gender;
}
