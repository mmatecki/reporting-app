package me.matecki.reporting.rest.dto;


import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

public class ProductQuantityResponseWrapper {

    private final List<ProductQuantityDto> quantities;

    public ProductQuantityResponseWrapper(List<ProductQuantityDto> quantities) {
        this.quantities = quantities;
    }

    public ProductQuantityResponseWrapper() {
        this.quantities = new ArrayList<>();
    }

    public List<ProductQuantityDto> getQuantities() {
        return ImmutableList.copyOf(quantities);
    }

    public void add(ProductQuantityDto productQuantityDto) {
        quantities.add(productQuantityDto);
    }
}
