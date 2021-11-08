package order;
import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowers.Item;
import payments.Payment;

import java.util.ArrayList;
import java.util.List;


public class QuickOrder {
    public static Order createOrder(Item[] items,Payment payment, Delivery delivery){
        Order order= new Order();
        order.setPayment(payment);
        order.setDelivery(delivery);
        for (int i =0;i<items.length;i++){
            order.addItem(items[i]);
        }
        return order;
    }

}
