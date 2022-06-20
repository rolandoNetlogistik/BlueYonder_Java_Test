package com.example.testRolando.Shipment;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;

public class Shipment {
    private String orderId;
    private String shipmentId;
    private String productId;
    private LocalDate shipmentDate;
    private Double qty;

    public Shipment(String orderId, String shipmentId, String productId, LocalDate shipmentDate, Double qty) {
        this.orderId = orderId;
        this.shipmentId = shipmentId;
        this.productId = productId;
        this.shipmentDate = shipmentDate;
        this.qty = qty;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(LocalDate shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }
}
