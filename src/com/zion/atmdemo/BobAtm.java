package com.zion.atmdemo;

public class BobAtm implements BankATM {
    CreditCard card;

    public BobAtm(CreditCard card) {
        this.card = card;
    }

    double dAmt= 0.0;
    @Override
    public void deposit(double amount) {
        dAmt = card.getAmount()+amount;
        System.out.println("BOB: Deposited amount: "+dAmt);
    }
    double wAmt = 0.0;
    @Override
    public void withdraw(double wamount) {
        wAmt = dAmt-wamount;
        System.out.println(wamount+"is deducted from your account SBI");
        System.out.println("BOB: Balance: "+wAmt);
    }

    @Override
    public void checkBalance() {
        System.out.println("BOB: Your balance : "+wAmt);

    }
}
