package com.order.notification.core.dto;

import java.util.List;

public class NewOrderDTO {

    private Long orderIdentifier;
    private String customerEmail;
    private List<ProductsDto> productsList;

}
