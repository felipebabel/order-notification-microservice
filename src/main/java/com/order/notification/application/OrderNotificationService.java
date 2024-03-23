package com.order.notification.application;

import com.order.notification.core.dto.EmailDto;
import com.order.notification.core.dto.NewOrderDTO;
import com.order.notification.core.exception.OrderNotificationException;
import com.order.notification.core.util.ValidateFields;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class OrderNotificationService implements OrderNotificationServiceAPI {

    private final EmailService emailService;

    @Autowired
    public OrderNotificationService(final EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendNewOrder(final
                             NewOrderDTO newOrderDTO) throws OrderNotificationException {
        ValidateFields.validate(newOrderDTO);

//        this.userRepository.getUserByEmail(newOrderDTO.getEmail()).orElseThrow(() -> new OrderNotificationException(Messages.MSG_EMAIL_SENT_SUCCESSFUL));
//
//        Double qtd = 0.0;
//
//        for (final ProductsDto productsDto : newOrderDTO.getProductsList()) {
//            this.productRepository.getProductById(productsDto.getIdentifier());
//            qtd += productsDto.getQuantity();
//        }
//
//        this.productRepository.getTotalQtdAndValidate(qtd);
        final EmailDto email = new EmailDto();
        email.setBody("test");
        email.setTo("babelfelipe@gmail.com");
        email.setFrom("babelfelipe@gmail.com");
        email.setSubject("test");
        this.emailService.sendEmail(email);

    }

}
