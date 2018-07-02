package com.procountor;

import java.util.List;

public class Invoice {
    public String id;
    public List<String> elements;

    public Invoice(String id, List<String> elements) {
        this.id = id;
        this.elements = elements;
    }
}
