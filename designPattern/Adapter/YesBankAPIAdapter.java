package com.divya.design.pattern.Adapter;

import com.divya.design.pattern.Adapter.Bank.BankAccount;

public class YesBankAPIAdapter implements IBankAPIAdapter{
    @Override
    public int getBalance(String accNo) {
        return 0;
    }

    @Override
    public boolean transfer(int amount, String to, String from) {
        return false;
    }

    @Override
    public boolean createBankAcount(BankAccount b) {
        return false;
    }
}
