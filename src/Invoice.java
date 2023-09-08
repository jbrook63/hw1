/*
 * CS2050 - Computer Science II - Fall 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Homework 01 - Invoice
 */

public class Invoice {
    private static int invoiceCounter = 1;
    private int number;
    private String title;
    private String clientName;
    private String clientPhoneNumber;
    private double amount;
    private boolean isPastDue;

    public Invoice(String title, String clientName, String phoneNumber, double amount, boolean isPastDue) {
        this.number = invoiceCounter++;
        this.title = title;
        this.clientName = clientName;
        this.clientPhoneNumber = phoneNumber;
        this.amount = Math.max(0, amount); // Ensure non-negative amount
        this.isPastDue = isPastDue;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPastDue() {
        return isPastDue;
    }

    @Override
    public String toString() {
        return "Invoice Number: " + number + "\n" +
                "Title: " + title + "\n" +
                "Client Name: " + clientName + "\n" +
                "Phone Number: " + clientPhoneNumber + "\n" +
                "Amount: $" + amount + "\n" +
                "Past Due: " + (isPastDue ? "Yes" : "No");
    }
}


