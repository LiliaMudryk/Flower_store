package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecieverTest {

    @Test
    void getId() {
        ID.reset();
        Reciever r1 = new Reciever();
        Reciever r2 = new Reciever();
        assertEquals(r1.getId(),0);
        assertEquals(r2.getId(),1);


    }

}