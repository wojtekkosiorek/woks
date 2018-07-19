package com.procountor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //Lista  produkt-faktura
        List<Products> invoice1 = new ArrayList<Products>();
        invoice1.add(new Products("Water",new BigDecimal("1.05"), new BigDecimal("1")));
        invoice1.add(new Products("Milk", new BigDecimal("2.99"), new BigDecimal("3")));

        List<Products> invoice2 = new ArrayList<Products>();
        invoice2.add(new Products("Watermelon", new BigDecimal("0.99"), new BigDecimal("2")));
        invoice2.add(new Products("Apple", new BigDecimal("0.79"), new BigDecimal("2")));
        invoice2.add(new Products("Sugar", new BigDecimal("2"), new BigDecimal("1")));

        //Lista faktur
        List<Invoice> allinvoices = new ArrayList<>();
        allinvoices.add(new Invoice("1", invoice1));
        allinvoices.add(new Invoice("2", invoice2));

        System.out.println("=============");
        System.out.println("Invoice list:");
        System.out.println("=============");
        System.out.println();

        System.out.println(allinvoices.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));

    }

}
