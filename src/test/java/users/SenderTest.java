package users;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {

    @Test
    void getId() {
        Sender s1 = new Sender();
        assertEquals(s1.getId(),0);
        Sender s2 = new Sender();
        assertEquals(s2.getId(),1);
        s1=null;
        s2=null;
    }
}