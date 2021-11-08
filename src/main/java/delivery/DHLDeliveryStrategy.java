package delivery;

import flowers.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Order.Order will be delivered DHL.");
        return true;
    }
}
