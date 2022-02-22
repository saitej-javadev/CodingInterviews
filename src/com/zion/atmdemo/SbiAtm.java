package com.zion.atmdemo;

public class SbiAtm implements BankATM {
    CreditCard card;

    public SbiAtm(CreditCard card) {
        this.card = card;
    }

    double dAmt= 0.0;
    @Override
    public void deposit(double amount) {
         dAmt = card.getAmount()+amount;
        System.out.println("SBI: Deposited amount: "+amount);
        System.out.println("Total balace :" +dAmt);
    }
       double wAmt = 0.0;
    @Override
    public void withdraw(double wamount) {
        wAmt = dAmt-wamount;
        System.out.println(wamount+"is deducted from your account SBI");
        System.out.println("SBI: Balance: "+wAmt);
    }

    @Override
    public void checkBalance() {
        System.out.println("SBI: Your balance : "+wAmt);

    }
}

