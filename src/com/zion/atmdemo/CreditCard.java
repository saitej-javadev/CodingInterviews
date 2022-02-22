package com.zion.atmdemo;

public class CreditCard {
    private String ccNo;
    private String ccType;
    private long amount;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public CreditCard() {
    }

    public CreditCard(String ccNo, String ccType,long amount) {
        this.ccNo = ccNo;
        this.ccType = ccType;
        this.amount =amount;
    }

    public String getCcNo() {
        return ccNo;
    }

    public void setCcNo(String ccNo) {
        this.ccNo = ccNo;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
    }
}
