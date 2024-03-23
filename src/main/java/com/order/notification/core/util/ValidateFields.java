package com.order.notification.core.util;

import com.order.notification.core.constant.Messages;
import com.order.notification.core.dto.NewOrderDTO;
import com.order.notification.core.dto.ProductsDto;
import com.order.notification.core.exception.OrderNotificationException;
import java.util.Objects;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ValidateFields {

    public void validate(final NewOrderDTO newOrderDTO) throws OrderNotificationException {
        if (Objects.isNull(newOrderDTO.getOrderIdentifier())) {
            throw new OrderNotificationException(Messages.MSG_FIELD_ID_NOT_INFORMED, Messages.SUCCESS_MSG);
        }
        if (Objects.isNull(newOrderDTO.getEmail())) {
            throw new OrderNotificationException(Messages.MSG_FIELD_ID_NOT_INFORMED, Messages.SUCCESS_MSG);
        }
        if (Objects.isNull(newOrderDTO.getProductsList())) {
            throw new OrderNotificationException(Messages.MSG_FIELD_ID_NOT_INFORMED, Messages.SUCCESS_MSG);
        }
        for (final ProductsDto productsDto : newOrderDTO.getProductsList()) {
            if (Objects.isNull(productsDto.getIdentifier())) {
                throw new OrderNotificationException(Messages.MSG_FIELD_ID_NOT_INFORMED, Messages.SUCCESS_MSG);
            }
            if (Objects.isNull(productsDto.getName())) {
                throw new OrderNotificationException(Messages.MSG_FIELD_ID_NOT_INFORMED, Messages.SUCCESS_MSG);
            }
            if (Objects.isNull(productsDto.getQuantity())) {
                throw new OrderNotificationException(Messages.MSG_FIELD_ID_NOT_INFORMED, Messages.SUCCESS_MSG);
            }
        }

    }

}
