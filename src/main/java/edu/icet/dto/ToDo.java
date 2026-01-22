package edu.icet.dto;

import edu.icet.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ToDo {
    private Integer id;
    private Integer schoolId;
    private String name;
    private String address;
    private String email;
    private String phone;
    private Integer age;
    private Gender gender;
}
