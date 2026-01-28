package edu.icet.dto;

import edu.icet.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AttendanceDTO {
    private  Integer id;
    private Date date;
    private Status status;
}
