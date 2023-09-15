package com.divya.design.pattern.Adapter;

public class PhonePe {
    private IBankAPIAdapter bankAPIAdapter;

    public IBankAPIAdapter getAPIAdaapter(String type){
        switch(type){
            case "ICICI": return new ICICIBankAPIAdapter();
            case  "yes": return new YesBankAPIAdapter();
            default:  return new YesBankAPIAdapter();
        }
    }

    public void makePayment(int x, String from, String to){
        bankAPIAdapter.transfer(x,from,to);
    }

}
