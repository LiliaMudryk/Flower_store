package payments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    double price;
    PayPalPaymentStrategy payment;
    @BeforeEach
    void setUp() {
        price = 0;
        payment = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(payment.pay(price));
    }
}