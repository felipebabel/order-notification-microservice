package com.order.notification.core.util;

public class DefaultResponse {

    public static final String ERROR = "Error";

    public static final String SUCCESS = "Success";

    private final String status;

    private final String message;

    public DefaultResponse(final String status,
                           final String message) {
        this.status = status;
        this.message = message;
    }

}
