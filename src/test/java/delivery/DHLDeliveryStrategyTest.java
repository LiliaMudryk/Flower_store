package delivery;

import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    DHLDeliveryStrategy delivery;
    Item flower;
    List<Item> items;
    @BeforeEach
    void setUp() {
        delivery=new DHLDeliveryStrategy();
        List<Item> items = new ArrayList<>();

    }

    @Test
    void deliver() {
        assertTrue(delivery.deliver(items));
    }
}