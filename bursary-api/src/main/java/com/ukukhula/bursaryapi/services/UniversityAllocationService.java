package com.ukukhula.bursaryapi.services;

import com.ukukhula.bursaryapi.entities.University;
import com.ukukhula.bursaryapi.entities.UniversityAllocation;
import com.ukukhula.bursaryapi.repositories.UniversityAllocationRepository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityAllocationService {
    @Autowired
    private final UniversityAllocationRepository universityAllocationRepository;

    public UniversityAllocationService(UniversityAllocationRepository universityAllocationRepository) {
        this.universityAllocationRepository = universityAllocationRepository;
    }

    public UniversityAllocation findUniversityAllocationById(int id) {
        return universityAllocationRepository.findById(id);
    }

    public List<UniversityAllocation> getAllAllocations() {
        return universityAllocationRepository.getAllStudentAllocations();
    }

    public Integer allocateFundsToUniversity(int id, BigDecimal amount) {
        return universityAllocationRepository.allocateFundsToUniversity(id, amount);
    }

    public Integer allocateFundsToAllUniversities() {
        return universityAllocationRepository.allocateFundsToAllUniversities();
    }
}