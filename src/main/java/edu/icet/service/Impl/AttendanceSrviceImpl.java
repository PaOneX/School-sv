package edu.icet.service.Impl;

import edu.icet.dto.AttendanceDTO;
import edu.icet.entity.AttendanceEntity;
import edu.icet.repository.AttendanceRepository;
import edu.icet.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AttendanceSrviceImpl implements AttendanceService {

    private final AttendanceRepository repo;
    private final ModelMapper mapper;

    @Override
    public void addAttendance(AttendanceDTO attendanceDTO) {
        repo.save(mapper.map(attendanceDTO, AttendanceEntity.class));
    }

    @Override
    public void updateAttendance(AttendanceDTO attendanceDTO) {
        repo.save(mapper.map(attendanceDTO, AttendanceEntity.class));

    }

    @Override
    public void deleteAttendance(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public List<AttendanceDTO> getAllAttendance() {
        List<AttendanceEntity> attendanceEntities = repo.findAll();
        ArrayList<AttendanceDTO> attendanceDTOS =new ArrayList<>();
        attendanceEntities.forEach(attendanceEntity -> {
            AttendanceDTO attendanceDTO = mapper.map(attendanceEntity, AttendanceDTO.class);
            attendanceDTOS.add(attendanceDTO);
        });
        return attendanceDTOS;
    }

    @Override
    public AttendanceDTO getAttendanceById(Integer id) {
        AttendanceEntity attendanceEntity = repo.findById(id).orElseThrow();
        return  mapper.map(attendanceEntity, AttendanceDTO.class);
    }
}
