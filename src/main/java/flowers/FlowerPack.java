package flowers;

public class FlowerPack extends Item{
    private int amount;
    private Flower flower;
    public FlowerPack(Flower flower,int amount){
        this.flower = flower;
        this.amount = amount;
    }
    public double getPrice(){
        return flower.getPrice()*amount;
    }

    @Override
    public String getDescription() {
        return "";
    }

    public int getAmount() {
        return amount;
    }

    public Flower getFlower() {
        return flower;
    }
}
