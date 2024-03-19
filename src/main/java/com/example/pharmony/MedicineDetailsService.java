package com.example.pharmony;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicineDetailsService {

    @Autowired
    private MedicineDetailsRepository medicineDetailsRepository;

    // Method to get all medicine details
    public List<MedicineDetails> getAllMedicineDetails() {
        return medicineDetailsRepository.findAll();
    }
}

