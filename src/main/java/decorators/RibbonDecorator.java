package decorators;
import flowers.Item;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        super(item);
    }
    @Override
    public double getPrice() {
        double price = getItem().getPrice();
        return price+4;
    }
}