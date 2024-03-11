package com.order.notification.core.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NewOrderDTO {

    @Schema(
        description = "Order identifier email address",
        example = "123")
    private Long orderIdentifier;

    @Schema(
        description = "Customer email address",
        example = "curtomer@example.com")
    private String email;

    @Schema(description = "List of products")
    private List<ProductsDto> productsList;

}
