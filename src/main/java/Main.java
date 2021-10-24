import decorators.BasketDecorator;
import decorators.PaperDecorator;
import delivery.DHLDeliveryStrategy;
import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowers.*;
import payments.PayPalPaymentStrategy;

public class Main {
    public static void main(String[] args) {

        Flower rose = new Flower(FlowerType.ROSE,25, new int[]{1,2,3},7);
        Item  rose1 = new Flower(FlowerType.ROSE,25, new int[]{1,2,3},7);
        FlowerPack flowerPack = new FlowerPack(rose, 4);
        Item bucket = new FlowerBucket(new FlowerPack[]{flowerPack,flowerPack});
        rose1 = new BasketDecorator(rose1);
        Order order=new Order();
        order.addItem(bucket);
        order.addItem(rose1);
        PostDeliveryStrategy dhl = new PostDeliveryStrategy();
        order.setDelivery(dhl);
        order.setPayment(new PayPalPaymentStrategy());
        order.processOrder();
    }
}
