package com.zion.atmdemo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestAtm {
    public static void main(String[] args) {
        CreditCard obj = new CreditCard("1256895","Visa",10000);
        BankATM bankATM = new BobAtm(obj);
        System.out.println("Your balance as  on "+ LocalDate.now()+" is "+obj.getAmount());

        bankATM.deposit(2000);
        bankATM.withdraw(5000);
        bankATM.checkBalance();

    }
}