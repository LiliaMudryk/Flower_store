package decorators;

import flowers.Item;
import lombok.Getter;

@Getter
public class ItemDecorator extends Item {
    private Item item;
    public ItemDecorator(Item item){
        this.item=item;

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
    public Item getItem(){
        return item;
    }
}
