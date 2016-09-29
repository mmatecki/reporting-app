package me.matecki.reporting.model;


public class ProductQuantity {

    private Long productId;

    private Double quantity;

    public ProductQuantity() {
    }

    public ProductQuantity(Long productId, Double quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
