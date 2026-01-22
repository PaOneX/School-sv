package edu.icet.dto;

import edu.icet.util.City;
import edu.icet.util.Province;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SchoolDTO {
    private Integer id;
    private String schoolName;
    private Province province;
    private City city;
    private Integer estabilishYear;

}
