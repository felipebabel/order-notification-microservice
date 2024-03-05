package com.order.notification.core.exception;

public class OrderNotificationException extends Exception {

    public OrderNotificationException(final String message,
                                      final Object... args) {
        super(String.format(message, args));
    }



}
