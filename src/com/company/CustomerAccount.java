package com.company;

public class CustomerAccount {
    private String number;
    private double balance;

    public CustomerAccount(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }
}
