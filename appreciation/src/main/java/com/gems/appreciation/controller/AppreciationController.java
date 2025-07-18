package com.gems.appreciation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gems.appreciation.entities.AppreciationDto.Appreciation;
import com.gems.appreciation.service.AppreciationService;

@RestController
@RequestMapping("/appreciations")
public class AppreciationController {

    @Autowired
    private AppreciationService appreciationService;

    @PostMapping
    public ResponseEntity<String> createAppreciation(@RequestBody Appreciation appreciation) {
        appreciationService.submitAppreciation(appreciation);
        return ResponseEntity.ok("Appreciation recorded successfully!");
    }

    @GetMapping
    public List<Appreciation> getAllAppreciations() {
        return appreciationService.getAllAppreciations();
    }
}
