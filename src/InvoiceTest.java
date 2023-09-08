/*
 * CS2050 - Computer Science II - Fall 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Homework 01 - InvoiceTest
 */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    static Invoice inv[];

    @BeforeAll
    public static void setup() {
        inv = new Invoice[10];
        inv[0] = new Invoice("", "", "", 0, false);
        inv[1] = new Invoice("", "", "", 0, false);
        inv[2] = new Invoice("", "", "", 0, false);
        inv[3] = new Invoice("a title", "", "", 0, false);
        inv[4] = new Invoice("", "client name", "", 0, false);
        inv[5] = new Invoice("", "", "client phone number", 0, false);
        inv[6] = new Invoice("", "", "", 315.12, false);
        inv[7] = new Invoice("", "", "", -315.12, false);
        inv[8] = new Invoice("", "", "", 0, true);
        inv[9] = new Invoice("", "", "", 0, false);
    }

    @Test
    public void testInvoiceNumberCounter() {
        assertEquals(1, inv[0].getNumber());
        assertEquals(2, inv[1].getNumber());
        assertEquals(3, inv[2].getNumber());
    }

    @Test
    void testInvoiceTitleIsSet() {
        assertEquals("a title", inv[3].getTitle());
    }

    @Test
    void testInvoiceClientNameIsSet() {
        assertEquals("client name", inv[4].getClientName());
    }

    @Test
    void testInvoiceClientPhoneNumberIsSet() {
        assertEquals("client phone number", inv[5].getClientPhoneNumber());
    }

    @Test
    void testInvoiceAmountIsSet() {
        assertEquals(315.12, inv[6].getAmount(), 0.0001);
    }

    @Test
    void testInvoiceNegativeAmountIsSet() {
        assertEquals(0, inv[7].getAmount(), 0.0001);
    }

    @Test
    void testInvoiceIsPastDue() {
        assertTrue(inv[8].isPastDue());
    }

    @Test
    void testInvoiceIsNotPastDue() {
        assertFalse(inv[9].isPastDue());
    }

    @Test
    void testToStringIsDefined() {
        assertNotEquals("", inv[3].toString());
    }
}
