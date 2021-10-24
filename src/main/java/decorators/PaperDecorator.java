package decorators;

import flowers.Item;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }
    @Override
    public double getPrice() {
        double price = getItem().getPrice();
        return price+3;
    }
}
