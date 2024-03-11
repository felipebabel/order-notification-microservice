package com.order.notification.application;

import com.order.notification.core.dto.NewOrderDTO;
import com.order.notification.core.dto.ProductsDto;
import com.order.notification.core.exception.OrderNotificationException;
import com.order.notification.core.util.ValidateFields;
import com.order.notification.repository.OrderRepository;
import com.order.notification.repository.ProductRepository;
import com.order.notification.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class OrderNotificationService implements OrderNotificationServiceAPI {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    public void sendNewOrder(final
                             NewOrderDTO newOrderDTO) throws OrderNotificationException {
        ValidateFields.validate(newOrderDTO);

        this.userRepository.getUserByEmailAndValidate(newOrderDTO.getEmail());

        for (final ProductsDto productsDto : newOrderDTO.getProductsList()) {
            this.productRepository.getProductByIdAndValidate(productsDto.getIdentifier());
        }

        //TODO VALIDAR QTD PRODUTO

        return;
    }

}
