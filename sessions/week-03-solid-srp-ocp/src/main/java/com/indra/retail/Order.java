package com.indra.retail;

import java.math.BigDecimal;

public class Order {

    private final String id;
    private final BigDecimal price;
    private final DiscountType discountType;
    private final DiscountStrategy discountStrategy;
    

	private final int requestedQuantity;
    private final String customerEmail;

    public Order(String id, BigDecimal price, DiscountStrategy discountStrategy,
        DiscountType discountType, int requestedQuantity, String customerEmail) {
        this.id = id;
        this.price = price;
        this.discountStrategy = discountStrategy;
        this.requestedQuantity = requestedQuantity;
        this.customerEmail = customerEmail;
        this.discountType = discountType;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
    
    public DiscountStrategy getDiscountCalculator() {
		return discountStrategy;
	}

    public DiscountType getDiscountType() {
        return discountType;
    }
    
}
