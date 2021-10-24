package delivery;

import flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Your order will be delivered by post.");
        return true;
    }
}
