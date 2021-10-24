package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private Flower rose;
    private FlowerPack rosePack;
    private Flower tulip;
    private FlowerPack tulipPack;
    private FlowerBucket flowerBucket;
    @BeforeEach
    void setUp() {
        rose = new Flower(FlowerType.ROSE);
        rose.setPrice(25);
        tulip = new Flower(FlowerType.TULIP);
        tulip.setPrice(10);
        rosePack = new FlowerPack(rose,4);
        tulipPack = new FlowerPack(tulip,10);
        flowerBucket = new FlowerBucket();
        flowerBucket.flowerPackList.add(rosePack);
        flowerBucket.flowerPackList.add(tulipPack);

    }

    @Test
    void getPrice() {
        flowerBucket.setPrice();
        assertEquals(flowerBucket.getPrice(), 200);
    }
}