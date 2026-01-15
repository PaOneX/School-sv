package edu.icet.service;

import org.springframework.stereotype.Service;

public class StudentServiceV1 implements StudentService {
    @Override
    public String getVersion() {
        return "V1.0.0";
    }

    public String getName(){
        return "Pawaan";
    }
}
