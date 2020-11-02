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

    public boolean getMoney(int amount) {
        if(balance < amount) {
            return false;
        }

        balance -= amount;

        return true;
    }
}
