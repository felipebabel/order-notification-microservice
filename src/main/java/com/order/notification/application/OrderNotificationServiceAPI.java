package com.order.notification.application;

import com.order.notification.core.dto.NewOrderDTO;
import com.order.notification.core.exception.OrderNotificationException;

public interface OrderNotificationServiceAPI {

    public void sendNewOrder(final
                             NewOrderDTO newOrderDTO) throws OrderNotificationException;

}
