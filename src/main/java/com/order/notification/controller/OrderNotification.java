package com.order.notification.controller;

import com.order.notification.core.dto.NewOrderDTO;
import com.order.notification.core.exception.OrderNotificationException;
import com.order.notification.core.util.DefaultResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface OrderNotification {

    ResponseEntity<DefaultResponse> createNewOrder(@RequestBody NewOrderDTO newOrderDTO) throws OrderNotificationException;

}
