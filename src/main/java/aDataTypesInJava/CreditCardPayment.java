package aDataTypesInJava;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment" + amount);
    }
}
