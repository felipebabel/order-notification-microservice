package com.order.notification.controller;

import com.order.notification.core.constant.Messages;
import com.order.notification.core.dto.NewOrderDTO;
import com.order.notification.core.exception.OrderNotificationException;
import com.order.notification.core.util.DefaultResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface OrderNotification {

    @Operation(
        summary = "Send New Order Notification",
        description = "Send an order notification using the provided information.",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = Messages.MSG_EMAIL_SENT_SUCCESSFUL,
                content = @Content(
                    mediaType = "application/json",
                    examples = @ExampleObject(
                        Messages.MSG_EMAIL_SENT_SUCCESSFUL))),
            @ApiResponse(
                responseCode = "400",
                content = @Content(
                    mediaType = "application/json",
                    examples = {
                        @ExampleObject(
                            name = "Status 1, Error",
                            value = Messages.MSG_EMAIL_SENT_SUCCESSFUL),
                        @ExampleObject(
                            name = "Status 2, Error",
                            value = Messages.MSG_EMAIL_SENT_SUCCESSFUL)})),
            @ApiResponse(
                responseCode = "500",
                content = @Content(
                    mediaType = "application/json",
                    examples = {
                        @ExampleObject(
                            name = "Status 1, Error",
                            value = Messages.MSG_EMAIL_SENT_SUCCESSFUL),
                        @ExampleObject(
                            name = "Status 2, Error",
                            value = Messages.MSG_EMAIL_SENT_SUCCESSFUL)
                    }))
        })
    ResponseEntity<DefaultResponse> createNewOrder(@RequestBody final NewOrderDTO newOrderDTO) throws OrderNotificationException;

    ResponseEntity<DefaultResponse> createUser() throws OrderNotificationException;

    ResponseEntity<DefaultResponse> createProduct() throws OrderNotificationException;

    ResponseEntity<DefaultResponse> getProductById() throws OrderNotificationException;

    ResponseEntity<DefaultResponse> getAllProduct() throws OrderNotificationException;

    ResponseEntity<DefaultResponse> getAllOrder() throws OrderNotificationException;

    ResponseEntity<DefaultResponse> getOrderById() throws OrderNotificationException;

    ResponseEntity<DefaultResponse> getAllUser() throws OrderNotificationException;

    ResponseEntity<DefaultResponse> getUserById() throws OrderNotificationException;

}


