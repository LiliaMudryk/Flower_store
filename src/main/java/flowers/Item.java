package flowers;

public abstract class  Item {
    private String desctription;
    public abstract double getPrice();
    public String getDescription(){
        return desctription;
    }
}
