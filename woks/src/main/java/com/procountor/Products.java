package com.procountor;


import java.math.BigDecimal;

public class Products {
    public String name;
    public BigDecimal price;
    public BigDecimal quantity;

    public Products(String name, BigDecimal price, BigDecimal quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal calculateCost() {
        return price.multiply(quantity);
    }


    public BigDecimal getPrice() {

        return price;
    }

    public void setPrice(BigDecimal price) {

        this.price = price;
    }

    public BigDecimal getQuantity() {

        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {

        this.quantity = quantity;
    }

    @Override
    public String toString() {

        return "\n" + name + "| Quantity: " + quantity + "| " +
                " Unit price: " + price + "$ | " +
                "SUM " + price.multiply(quantity) + "$ | ";


    }
}
