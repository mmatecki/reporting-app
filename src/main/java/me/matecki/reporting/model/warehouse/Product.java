package me.matecki.reporting.model.warehouse;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

    private final Long productId;

    private final String name;

    private final Double quantity;

    public Product(@JsonProperty("productId") Long productId, @JsonProperty("name") String name, @JsonProperty("quantity") Double quantity) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }
}
