package com.company;

import java.util.ArrayList;
import java.util.List;

public class Atm {
    private int balance;
    private List<CustomerAccount> accounts = new ArrayList<>();

    public Atm(int balance) {
        this.balance = balance;
        loadCustomerAccounts();
    }

    public boolean checkAccount(String number) {
       var result = accounts.stream().filter(a -> a.getNumber().equals(number)).findFirst();
       return result.isPresent();
    }

    public String getMoney(String accountNumber, int amount) {
        var account = getAccount(accountNumber);

        if(account == null) {
            return "Account " + accountNumber + " not found";
        }

        if(balance < amount) {
            return "Choose another amount";
        }

        if(account.getMoney(amount)) {
            balance -= amount;
            return "Take";
        };

        return "Not enough money! Choose another amount";
    }

    private CustomerAccount getAccount(String accountNumber) {
        var result = accounts.stream().filter(a -> a.getNumber().equals(accountNumber)).findFirst();
        if(result.isPresent()) {
            return result.get();
        }

        return null;
    }

    private void loadCustomerAccounts() {
        accounts.add(new CustomerAccount("1111", 50));
        accounts.add(new CustomerAccount("2222", 100));
        accounts.add(new CustomerAccount("3333", 0));
        accounts.add(new CustomerAccount("4444", 50000000));
        accounts.add(new CustomerAccount("5555", 6060));
        accounts.add(new CustomerAccount("6666", 787878));
        accounts.add(new CustomerAccount("7777", 500));
    }
}
