package users;

import lombok.Getter;
import static users.ID.uploadID;
@Getter
public class Reciever implements User{
    private int id;
    public Reciever() {
        this.id = uploadID();
    }

    public int getId() {
        return id;
    }

    @Override
    public void update(String status) {
        System.out.println("Dear Receiver, your order status update.Current status: "+status);    }
}
