package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecieverTest {

    @Test
    void getId() {
        Reciever r1 = new Reciever();
        Sender s1 = new Sender();
        Reciever r2 = new Reciever();
        assertEquals(r1.getId(),3);
        assertEquals(r2.getId(),2);
        r1 = null;
        r2=null;
        s1=null;
    }

}