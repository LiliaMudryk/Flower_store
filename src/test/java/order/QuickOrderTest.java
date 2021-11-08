package order;

import delivery.DHLDeliveryStrategy;
import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.Test;
import payments.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    @Test
    void testFastOrder() {
        Order order = QuickOrder.createOrder(new Item[]{new Flower(FlowerType.CHAMOMILE,15,new int[]{10,11,21},5)},new PayPalPaymentStrategy(),new DHLDeliveryStrategy());
        assertTrue(order instanceof Order);
    }
}