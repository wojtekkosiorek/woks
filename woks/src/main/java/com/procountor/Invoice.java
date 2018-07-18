package com.procountor;


import java.math.BigDecimal;
import java.util.List;

public class Invoice {
    public String id;
    public List<Products> elements;


    public Invoice(String id, List<Products> elements) {
        this.id = id;
        this.elements = elements;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public List<Products> getElements() {

        return elements;
    }

    public void setElements(List<Products> elements) {

        this.elements = elements;
    }

    public BigDecimal totalCost () {
        return elements.stream()
                .map(Products::calculateCost)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String toString() {
        return "[ Invoice " + "id: " + id + " ]" + "\n" + elements + "\n" + "[ TOTAL INVOICE SUM: " + totalCost() + "$ ]"+ "\n"
                ;
    }
}




