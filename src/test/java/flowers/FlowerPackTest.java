package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(25);
        flowerPack = new FlowerPack(flower,4);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(flowerPack.getPrice(),100);
    }
}