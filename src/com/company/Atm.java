package com.company;

import java.util.ArrayList;
import java.util.List;

public class Atm {
    private int balance;
    private List<CustomerAccount> accounts = new ArrayList<>();

    public Atm(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public boolean checkAccount(String number) {
       var result = accounts.stream().filter(a -> a.getNumber().equals(number)).findFirst();
       return result.isPresent();
    }
}
