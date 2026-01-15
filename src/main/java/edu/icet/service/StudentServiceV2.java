package edu.icet.service;

import org.springframework.stereotype.Service;
@Service

public class StudentServiceV2 implements StudentService{

    @Override
    public String getName() {
        return "V2";
    }

    @Override
    public String getVersion() {
        return "V2.0.0";
    }
}
