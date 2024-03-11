package com.order.notification.core.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductsDto {

    @Schema(
        description = "Product identifier",
        example = "123")
    private Long identifier;

    @Schema(
        description = "Product name",
        example = "Product example")
    private String name;

    @Schema(
        description = "Product quantity",
        example = "15.6")
    private Double quantity;

    @Schema(
        description = "Product price",
        example = "99.90")
    private Double price;

}
