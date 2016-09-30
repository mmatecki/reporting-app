package me.matecki.reporting.rest.dto;


import me.matecki.reporting.model.ProductQuantity;

public class ProductQuantityToDtoMapper implements ToDto<ProductQuantityDto, ProductQuantity> {

    @Override
    public ProductQuantityDto toDto(ProductQuantity from) {
        return new ProductQuantityDto(from.getProductId(), from.getQuantity());
    }
}
