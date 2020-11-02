package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Atm atm1 = new Atm(5000);

       Scanner input = new Scanner(System.in);

	   while (true) {
           System.out.println("Enter account number:");

           var accountNumber = input.nextLine();

           if(!atm1.checkAccount(accountNumber)) {
               System.out.println("Invalid account");
               continue;
           }

           System.out.println("Enter amount:");

           var amount = input.nextInt();

           var result = atm1.getMoney(accountNumber, amount);

           System.out.println(result);

           input.nextLine();

           System.out.println("Do you want to continue? (Y/N)");

           var con = input.nextLine();

           if(con.toUpperCase().equals("Y")) {
               continue;
           }

           break;
       }

    }
}
