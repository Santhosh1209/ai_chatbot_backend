package com.example.pharmony;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class MedicineDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicineId;

    private String medicineName;
    private String manufacturer;
    private String genericName;
    private String dosageForm;
    private String strength;
    private Integer packSize;
    private Double price;
    private Boolean stockAvailability;
    private LocalDate expiryDate;
    private String category;
    private String subCategory;

    private String imagePath; // Storing path to the image file

    private Long supplierId;

    // Getters
    public Long getMedicineId() {
        return medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getGenericName() {
        return genericName;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public String getStrength() {
        return strength;
    }

    public Integer getPackSize() {
        return packSize;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getStockAvailability() {
        return stockAvailability;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    // Setters
    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public void setPackSize(Integer packSize) {
        this.packSize = packSize;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStockAvailability(Boolean stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
}
