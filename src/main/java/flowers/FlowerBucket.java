package flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();
    private double price;
    public FlowerBucket(FlowerPack[] flowerPacks ){
        for (int i =0;i<flowerPacks.length;i++){
             this.flowerPackList.add(flowerPacks[i]);
        }
        this.price=setPrice();


    }
    public double setPrice() {
        for (int i=0;i<flowerPackList.size();i++){
            price+=flowerPackList.get(i).getPrice();
        }
        return price;
    }
    public void addFlowerPack(FlowerPack flowerPack){
        flowerPackList.add(flowerPack);
        setPrice();

    }
    public void addFlowers(Flower flower,int amount){
        FlowerPack flowerPack = new FlowerPack(flower,amount);
        flowerPackList.add(flowerPack);

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        String flowers="Bucket. Flowers in bucket: ";
        for (int i=0;i<flowerPackList.size();i++){
            flowers+=flowerPackList.get(i).getFlower().getFlowerType()+", amount: "+flowerPackList.get(i).getAmount();
            if (i==flowerPackList.size()-1){
                flowers+=".";
            }
            else {
                flowers+="; ";
            }
        }
        return flowers+"\nBucket price "+getPrice();
    }
}

