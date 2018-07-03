package com.procountor;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //Lista wszystkich produktów
        List<String> products = new ArrayList<>();

        String product1 = "Milk";
        String product2 = "Water";
        String product3 = "Carrot";
        String product4 = "Apple";
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        //Wypisanie listy wszystkich produktów
        System.out.println("=============================");
        System.out.println("All products at the List: " + products.size());
        System.out.println("=============================");
        products.forEach(System.out::println);
        System.out.println();

        //Lista produktów na fakturach
        List<String> invoice1 = new ArrayList<>();
        List<String> invoice2 = new ArrayList<>();
        invoice1.add(product1);
        invoice1.add(product2);
        invoice2.add(product3);
        invoice2.add(product4);
        invoice2.add(product1);

        Invoice newInvoice1 = new Invoice("1", invoice1);
        Invoice newInvoice2 = new Invoice("2", invoice2);

        //Lista faktur
        List<Invoice> allinvoices = new ArrayList<>();
        allinvoices.add(newInvoice1);
        allinvoices.add(newInvoice2);
        System.out.println("=============================");
        System.out.println("Invoices list");
        System.out.println("=============================");
        System.out.println();
        allinvoices.forEach(Main::printInvoice);
        System.out.println();

    }

    private static void printInvoice(Invoice i) {
        System.out.println("Invoice No. : " +i.id);
        System.out.println("# Products amount: " + i.elements.size());
        i.elements.forEach(System.out::println);
        System.out.println();
        System.out.println();

    }
}
