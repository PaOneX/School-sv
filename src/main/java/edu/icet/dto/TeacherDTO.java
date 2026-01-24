package edu.icet.dto;

import edu.icet.util.City;
import edu.icet.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherDTO {
    private  Integer id;
    private String name;
    private Gender gender;
    private City city;
    private String subject;
    private String email;
    private String mobile;
}
