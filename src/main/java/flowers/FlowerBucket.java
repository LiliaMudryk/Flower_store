package flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();
    private double price = 0;

    public double setPrice() {
        for (int i=0;i<flowerPackList.size();i++){
            price+=flowerPackList.get(i).getPrice();
        }
        return price;
    }

    public double getPrice() {
        return price;
    }
}

