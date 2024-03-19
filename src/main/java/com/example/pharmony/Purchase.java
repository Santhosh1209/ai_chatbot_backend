package com.example.pharmony;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseId;

    private Long userId;
    private Long deliveryId;
    private String item;
    private Integer quantity;
    private Double cost;
    private String orderId;

    // Getters
    public Long getPurchaseId() {
        return purchaseId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }

    public String getItem() {
        return item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getCost() {
        return cost;
    }

    public String getOrderId() {
        return orderId;
    }

    // Setters
    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
