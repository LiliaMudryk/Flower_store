package payments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    double price;
    CreditCardPaymentStrategy payment;
    @BeforeEach
    void setUp() {
        price = 0;
        payment = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(payment.pay(price));
    }
}