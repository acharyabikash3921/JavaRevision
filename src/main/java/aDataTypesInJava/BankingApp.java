package aDataTypesInJava;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ac1", "Alice", 1000);


        account1.credit(1000);
    account1.credit(2000);
    account1.displayTransactionHistory();

    account1.debit(2000);
    account1.displayTransactionHistory();
        System.out.println(account1.balance);
    }
}
