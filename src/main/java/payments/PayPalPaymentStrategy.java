package payments;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("Payment by paypal. Sum to pay "+price);
        return true;
    }
}