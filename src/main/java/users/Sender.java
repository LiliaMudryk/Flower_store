package users;

import lombok.Getter;

import static users.ID.uploadID;

@Getter
public class Sender implements User{
    private int id;
    public Sender() {
        this.id = uploadID();
    }

    public int getId() {
        return id;
    }
    @Override
    public void update(String status) {
        System.out.println("Dear Sender, your order status update.Current status: "+status);
    }
}
