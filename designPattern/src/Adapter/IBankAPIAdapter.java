package com.divya.design.pattern.Adapter;

import com.divya.design.pattern.Adapter.Bank.BankAccount;

public interface IBankAPIAdapter {
    public int getBalance(String accNo);
    public boolean transfer(int amount, String to, String from);

    public boolean createBankAcount(BankAccount b);
}
