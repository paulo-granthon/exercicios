package pgranthon;

import org.junit.jupiter.api.Test;

import pgranthon.ex2.Invoice;

import static org.junit.jupiter.api.Assertions.*;

public class Ex2Test {

    @Test public void testGetInvoiceAmount() {
        Invoice invoice = new Invoice(1, "Item 1", 5, 10.0);
        assertEquals(50.0, invoice.getInvoiceAmount()); // Expected invoice amount: 5 * 10.0 = 50.0
    }

    @Test public void testGetNumber() {
        Invoice invoice = new Invoice(2, "Item 2", 3, 7.5);
        assertEquals(2, invoice.getNumber()); // Expected invoice number: 2
    }

    @Test public void testGetDescription() {
        Invoice invoice = new Invoice(3, "Item 3", 2, 15.0);
        assertEquals("Item 3", invoice.getDescription()); // Expected description: "Item 3"
    }

    @Test public void testGetAmount() {
        Invoice invoice = new Invoice(4, "Item 4", 8, 5.0);
        assertEquals(8, invoice.getAmount()); // Expected amount: 8
    }

    @Test public void testGetPrice() {
        Invoice invoice = new Invoice(5, "Item 5", 1, 20.0);
        assertEquals(20.0, invoice.getPrice()); // Expected price: 20.0
    }

    @Test public void testSetNumber() {
        Invoice invoice = new Invoice(6, "Item 6", 4, 9.0);
        invoice.setNumber(7);
        assertEquals(7, invoice.getNumber()); // Expected invoice number: 7
    }

    @Test public void testSetDescription() {
        Invoice invoice = new Invoice(8, "Item 8", 6, 12.0);
        invoice.setDescription("Updated Description");
        assertEquals("Updated Description", invoice.getDescription()); // Expected description: "Updated Description"
    }

    @Test public void testSetAmount() {
        Invoice invoice = new Invoice(9, "Item 9", 2, 25.0);
        invoice.setAmount(10);
        assertEquals(10, invoice.getAmount()); // Expected amount: 10
    }

    @Test public void testSetPrice() {
        Invoice invoice = new Invoice(11, "Item 11", 3, 8.0);
        invoice.setPrice(6.5);
        assertEquals(6.5, invoice.getPrice()); // Expected price: 6.5
    }

}
