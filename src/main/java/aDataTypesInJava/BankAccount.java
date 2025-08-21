package aDataTypesInJava;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    String accountId;
    String ownerName;
    double balance;
    List<Transaction> transactions;

    BankAccount(String accountId, String ownerName, double initialBalance) {
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }
    void credit(double amount) {
        balance += amount;
        Transaction t = new Transaction("TXN" + (transactions.size() + 1), amount, TransactionType.CREDIT);
        transactions.add(t);
        t.displayTransaction();
    }
    void debit(double amount) {
        balance -= amount;
        Transaction t = new Transaction("TXN" + (transactions.size() + 1), amount, TransactionType.DEBIT);
        transactions.add(t);
        t.displayTransaction();
    }

    void displayTransactionHistory() {
        System.out.println("Transaction History for " + ownerName + ":");
        for (Transaction t : transactions) {
            t.displayTransaction();
        }
    }

}
