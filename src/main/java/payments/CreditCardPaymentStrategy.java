package payments;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("Payment by card. Sum to pay "+price);
        return true;
    }
}
