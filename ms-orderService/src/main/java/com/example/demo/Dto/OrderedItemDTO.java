package com.example.demo.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderedItemDTO {

    @JsonProperty(value = "id")
    private Long productId;

    @JsonProperty(value = "name")
    private String productName;

    @JsonProperty(value = "quantidade")
    private Integer quantity;

    public OrderedItemDTO() {
    }

    public OrderedItemDTO(Long productId, String productName, Integer quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
