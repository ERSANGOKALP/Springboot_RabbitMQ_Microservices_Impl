package com.ersandev.stockservice.dto;

public class OrderEvent {
    private String status; // pending, process, completed
    private String message;
    private Order order;

    public OrderEvent(String status, String message, Order order) {
        this.status = status;
        this.message = message;
        this.order = order;
    }

    public OrderEvent() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
