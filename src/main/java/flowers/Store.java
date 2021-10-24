package flowers;

import java.util.Arrays;

public class Store {
    FlowerType[] stock;
    public Store(FlowerType[] flowerTypes){
        this.stock = flowerTypes;
    }

    public FlowerType[] getStock() {
        return stock;
    }

    public boolean search(Flower flower){
        if (Arrays.asList(stock).contains(flower.getFlowerType())) {
            return true;
        }
        return false;

    }
}
