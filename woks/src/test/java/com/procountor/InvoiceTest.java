package com.procountor;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceTest {

    @Test
    public void testCalculateTotalCost() {
        //Invoice List
        List<Products> invoice_test = new ArrayList<Products>();
        List<Products> invoice_test_zero = new ArrayList<Products>();


        //Product - invoice
        invoice_test.add(new Products("Test 1", new BigDecimal("2"), new BigDecimal("2")));
        invoice_test.add(new Products("Test 2", new BigDecimal("1.5"), new BigDecimal("1.5")));
        invoice_test_zero.add(new Products("Test 3", new BigDecimal("0"), new BigDecimal("1")));
        invoice_test_zero.add(new Products("Test 4", new BigDecimal("0"), new BigDecimal("-1")));

        //Invoice
        Invoice invoice = new Invoice("invoice_test", invoice_test);
        Invoice invoice_zero = new Invoice("invoice_test_zero", invoice_test_zero);


        // assert - invoice_test
        assertThat(invoice.totalCost()).isNotNull();
        assertThat(invoice.totalCost()).isGreaterThan(new BigDecimal(0));
        assertThat(invoice.totalCost()).isEqualByComparingTo(new BigDecimal(6.25));
        assertThat(invoice.totalCost()).isNotNegative();

        // assert - invoice_test_zero
        assertThat(invoice_zero.totalCost()).isNotNull();
        assertThat(invoice_zero.totalCost()).isZero();
        assertThat(invoice_zero.totalCost()).isNotNegative();

    }
}
