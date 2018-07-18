package com.procountor;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceTest {
    @Test

    public void testCalculateTotalCost() {
        List<Products> invoice_test = new ArrayList<Products>();
        invoice_test.add(new Products("Test 2",new BigDecimal("2"), new BigDecimal("2")));
        invoice_test.add(new Products("Test 2", new BigDecimal("1.5"), new BigDecimal("1.5")));

        Invoice invoice = new Invoice("invoice_test1", invoice_test);
    }
}
