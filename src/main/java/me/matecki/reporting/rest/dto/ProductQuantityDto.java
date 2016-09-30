package me.matecki.reporting.rest.dto;


public class ProductQuantityDto {

    private final Long productId;

    private final Double quantity;

    public ProductQuantityDto(Long productId, Double quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public Double getQuantity() {
        return quantity;
    }
}
