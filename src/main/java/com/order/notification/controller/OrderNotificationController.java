package com.order.notification.controller;

import com.order.notification.application.OrderNotificationService;
import com.order.notification.core.constant.Messages;
import com.order.notification.core.dto.NewOrderDTO;
import com.order.notification.core.exception.OrderNotificationException;
import com.order.notification.core.util.DefaultResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order-notification")
public class OrderNotificationController implements OrderNotification {

    private final OrderNotificationService orderNotificationService;

    public OrderNotificationController(final OrderNotificationService orderNotificationService) {
        this.orderNotificationService = orderNotificationService;
    }

    @PostMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DefaultResponse> createNewOrder(@RequestBody final NewOrderDTO newOrderDTO) throws OrderNotificationException {
        this.orderNotificationService.sendNewOrder(newOrderDTO);
        return new ResponseEntity<>(new DefaultResponse(DefaultResponse.SUCCESS, Messages.MSG_EMAIL_SENT_SUCCESSFUL), HttpStatus.OK);
    }

//    @PostMapping(
//        consumes = MediaType.APPLICATION_JSON_VALUE,
//        produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<DefaultResponse> createUser() throws OrderNotificationException {
//        this.orderNotificationService.sendNewOrder(newOrderDTO);
//        return new ResponseEntity<>(new DefaultResponse(DefaultResponse.SUCCESS, Messages.MSG_EMAIL_SENT_SUCCESSFUL), HttpStatus.OK);
//    }
//
//    @PostMapping(
//        consumes = MediaType.APPLICATION_JSON_VALUE,
//        produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<DefaultResponse> createProduct() throws OrderNotificationException {
//        this.orderNotificationService.sendNewOrder(newOrderDTO);
//        return new ResponseEntity<>(new DefaultResponse(DefaultResponse.SUCCESS, Messages.MSG_EMAIL_SENT_SUCCESSFUL), HttpStatus.OK);
//    }
//
//    @GetMapping(
//        value = "/product/{code}",
//        produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public ResponseEntity<DefaultResponse> getProductById() throws OrderNotificationException {
//        this.orderNotificationService.sendNewOrder(newOrderDTO);
//        return new ResponseEntity<>(new DefaultResponse(DefaultResponse.SUCCESS, Messages.MSG_EMAIL_SENT_SUCCESSFUL), HttpStatus.OK);
//    }
//
//    @GetMapping(
//        value = "/product",
//        produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public ResponseEntity<DefaultResponse> getAllProduct() throws OrderNotificationException {
//        this.orderNotificationService.sendNewOrder(newOrderDTO);
//        return new ResponseEntity<>(new DefaultResponse(DefaultResponse.SUCCESS, Messages.MSG_EMAIL_SENT_SUCCESSFUL), HttpStatus.OK);
//    }
//
//    @GetMapping(
//        value = "/order",
//        produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public ResponseEntity<DefaultResponse> getAllOrder() throws OrderNotificationException {
//        this.orderNotificationService.sendNewOrder(newOrderDTO);
//        return new ResponseEntity<>(new DefaultResponse(DefaultResponse.SUCCESS, Messages.MSG_EMAIL_SENT_SUCCESSFUL), HttpStatus.OK);
//    }
//
//    @GetMapping(
//        value = "/order/{code}",
//        produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public ResponseEntity<DefaultResponse> getOrderById() throws OrderNotificationException {
//        this.orderNotificationService.sendNewOrder(newOrderDTO);
//        return new ResponseEntity<>(new DefaultResponse(DefaultResponse.SUCCESS, Messages.MSG_EMAIL_SENT_SUCCESSFUL), HttpStatus.OK);
//    }
//
//    @GetMapping(
//        value = "/user",
//        produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public ResponseEntity<DefaultResponse> getAllUser() throws OrderNotificationException {
//        this.orderNotificationService.sendNewOrder(newOrderDTO);
//        return new ResponseEntity<>(new DefaultResponse(DefaultResponse.SUCCESS, Messages.MSG_EMAIL_SENT_SUCCESSFUL), HttpStatus.OK);
//    }
//
//    @GetMapping(
//        value = "/user/{code}",
//        produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public ResponseEntity<DefaultResponse> getUserById() throws OrderNotificationException {
//        this.orderNotificationService.sendNewOrder(newOrderDTO);
//        return new ResponseEntity<>(new DefaultResponse(DefaultResponse.SUCCESS, Messages.MSG_EMAIL_SENT_SUCCESSFUL), HttpStatus.OK);
//    }

}
