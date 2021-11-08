package order;

import delivery.Delivery;
import flowers.Item;
import payments.Payment;
import users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Payment payment;
    Delivery delivery;
    private int totalPrice;
    List<Item> items = new ArrayList<>();
    List<User> users = new ArrayList<User>();

    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public int calculateTotalPrice(){
        totalPrice=0;
        for (int i =0;i<items.size();i++){
            totalPrice+=items.get(i).getPrice();
        }
        return totalPrice;
    }
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public Delivery getDelivery() {
        return delivery;
    }
    public void processOrder(){
        System.out.println("Your order:");
        for (int i =0;i<items.size();i++){
            System.out.println(items.get(i).getDescription());
        }
        totalPrice = calculateTotalPrice();
        this.getDelivery().deliver(items);
        this.getPayment().pay(totalPrice);
    }
    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
    public void notifyUsers(){
        for (int i =0;i<users.size();i++) {
            users.get(i).update("Your order is ready!");
        }
    }
    public void order(){
        notifyUsers();
    }
}
