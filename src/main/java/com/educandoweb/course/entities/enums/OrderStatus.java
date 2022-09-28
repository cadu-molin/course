package com.educandoweb.course.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus orderStatusValue : OrderStatus.values()) {
            if (orderStatusValue.getCode() == code) {
                return orderStatusValue;
            }
        }

        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
