package aDataTypesInJava;

import java.time.LocalDateTime;

public class Transaction {
    String transactionId;
    double amount;
    TransactionType type;
    LocalDateTime timestamp;

    Transaction(String transactionId, double amount, TransactionType type) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    void displayTransaction() {
        System.out.println("[" + timestamp + "] " + type + " | ID: " + transactionId + " | Amount: $" + amount);
    }
}
