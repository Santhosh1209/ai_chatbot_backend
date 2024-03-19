package com.example.pharmony;
import java.util.List;

public interface PurchaseService {
    List<Purchase> getAllPurchases();
    List<Purchase> getPurchasesByUserId(Long userId);
    Purchase createPurchase(Purchase purchase);
}

