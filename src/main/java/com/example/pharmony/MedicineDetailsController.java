package com.example.pharmony;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/medicine-details")
public class MedicineDetailsController {

    @Autowired
    private MedicineDetailsService medicineDetailsService;

    // Endpoint to get all medicine details
    @GetMapping
    public List<MedicineDetails> getAllMedicineDetails() {
        return medicineDetailsService.getAllMedicineDetails();
    }
}

