package order;

import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Sender;
import users.User;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    Item flower;
    User user;
    @BeforeEach
    void setUp(){
        order = new Order();
        flower = new Flower(FlowerType.CHAMOMILE,15,new int[]{10,11,21},5);
        user = new Sender();
    }
    @Test
    void addItem() {
        order.addItem(flower);
        assertTrue(order.items.get(0)==flower);
    }

    @Test
    void removeItem() {
        order.removeItem(flower);
        assertTrue(order.items.size()==0);
    }

    @Test
    void calculateTotalPrice() {
        order.addItem(flower);
        assertEquals(order.calculateTotalPrice(),15);
    }

    @Test
    void addUser() {
        order.addUser(user);
        assertTrue(order.users.get(0)==user);
    }

    @Test
    void removeUser() {
        order.removeUser(user);
        assertTrue(order.users.size()==0);
    }

}