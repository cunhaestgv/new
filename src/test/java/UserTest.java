import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUser(){
        User u = new User("Maria", "Viseu");

        assertEquals("Maria", u.getName());
        assertEquals("Lisboa", u.getAddress());

    }

}
