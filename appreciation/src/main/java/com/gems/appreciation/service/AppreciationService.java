package com.gems.appreciation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gems.appreciation.entities.AppreciationDto.Appreciation;
import com.gems.appreciation.repository.AppreciationRepository;

@Service
public class AppreciationService {

    @Autowired
    private AppreciationRepository appreciationRepository;

    public void submitAppreciation(Appreciation appreciation) {
        appreciationRepository.save(appreciation);
    }

    public List<Appreciation> getAllAppreciations() {
        return appreciationRepository.findAll();
    }
}
