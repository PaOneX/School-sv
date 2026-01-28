package edu.icet.controller;

import edu.icet.dto.AttendanceDTO;
import edu.icet.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AttendanceController {

    private final AttendanceService attendanceService;

    @GetMapping("/get-all-attendance")
    public List<AttendanceDTO> getAllAttedance(){
        return attendanceService.getAllAttendance();
    }

    @GetMapping("/get-by-id/{id}")
    public AttendanceDTO getById(@PathVariable Integer id){
        return attendanceService.getAttendanceById(id);
    }

    @PostMapping("/add-attendance")
    public void addAttendance(@RequestBody AttendanceDTO attendanceDTO){
        attendanceService.addAttendance(attendanceDTO);
    }

    @PutMapping("/update-attendance")
    public void updateAttendance(@RequestBody AttendanceDTO attendanceDTO){
        attendanceService.updateAttendance(attendanceDTO);
    }

    @DeleteMapping("/delete-attendance/{id}")
    public void deleteAttendance(@PathVariable Integer id){
        attendanceService.deleteAttendance(id);
    }
}
