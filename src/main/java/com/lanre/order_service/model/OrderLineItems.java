package com.lanre.order_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private double price;
    private int quantity;

    public OrderLineItems(String skuCode, double price, int quantity) {
        this.skuCode = skuCode;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderLineItems() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderLineItems{" +
                "id=" + id +
                ", skuCode='" + skuCode + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
