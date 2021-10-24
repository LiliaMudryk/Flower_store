package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    FlowerType[] flowers;
    Store store;
    Flower tulip;
    Flower rose;
    @BeforeEach
    void setUp() {
        flowers=new FlowerType[]{FlowerType.ROSE};
        store=new Store(flowers);
        tulip = new Flower(FlowerType.TULIP);
        rose = new Flower(FlowerType.ROSE);


    }

    @Test
    void search() {
        assertFalse(store.search(tulip));
        assertTrue(store.search(rose));
    }
}