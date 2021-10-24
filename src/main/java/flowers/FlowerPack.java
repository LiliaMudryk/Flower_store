package flowers;

public class FlowerPack {
    private int amount;
    private Flower flower;
    public FlowerPack(Flower flower,int amount){
        this.flower = flower;
        this.amount = amount;
    }
    public double getPrice(){
        return flower.getPrice()*amount;
    }
}
