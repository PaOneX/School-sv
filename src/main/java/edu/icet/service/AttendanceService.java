package edu.icet.service;

import edu.icet.dto.AttendanceDTO;

import java.util.List;

public interface AttendanceService {
    void addAttendance(AttendanceDTO attendanceDTO);
    void updateAttendance(AttendanceDTO attendanceDTO);
    void deleteAttendance(Integer id);
    List<AttendanceDTO> getAllAttendance();
    AttendanceDTO getAttendanceById(Integer id);
}
