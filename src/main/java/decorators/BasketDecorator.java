package decorators;
import flowers.Item;

public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item) {
        super(item);
    }
    @Override
    public double getPrice() {
        double price = getItem().getPrice();
        return price+40;
    }
}