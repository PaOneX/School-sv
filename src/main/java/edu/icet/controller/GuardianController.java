package edu.icet.controller;

import edu.icet.dto.GuardianDTO;
import edu.icet.service.GuardianService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GuardianController {
    private final GuardianService guardianService;

    @GetMapping("/get-all")
    public List<GuardianDTO> getAll(){
        return guardianService.getAllGuardian();
    }

    @GetMapping("/get-guardian-byId/{id}")
    public GuardianDTO getGuardianService(@PathVariable Integer id) {
        return guardianService.getGuardianById(id);
    }

    @PostMapping("/add-guardian")
    public void addGuardian(@RequestBody GuardianDTO guardianDTO){
        guardianService.addGuardian(guardianDTO);
    }

    @PutMapping("/update-guardian")
    public void updateGuardian(GuardianDTO guardianDTO){
        guardianService.updateGuardian(guardianDTO);
    }

    @DeleteMapping("/delete-guardian/{id}")
    public  void deleteGuardian(@PathVariable Integer id){
        guardianService.deleteGuardian(id);
    }
}
