package flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(20);
        flower.setSepalLength(5.3);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(flower.getPrice(),20);
    }

    @Test
    void getFlowerType() {
        assertEquals(flower.getFlowerType(),FlowerType.ROSE);
    }

    @Test
    void testGetPrice() {
        assertEquals(flower.getPrice(),20);
    }


    @Test
    void getSepalLength() {
        assertEquals(flower.getSepalLength(),5.3);
    }
}