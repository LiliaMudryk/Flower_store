package decorators;

import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    Item flower;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE,25, new int[]{1,2,3},7);
    }

    @Test
    void getPrice() {
        assertEquals(flower.getPrice(),25);
        flower = new BasketDecorator(flower);
        assertEquals(flower.getPrice(),65);
    }
}