import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calTest {

    @Test
    void add() {
        assertEquals(5,cal.add(3,2));
    }
    @Test
    void test2() {
        assertEquals(10,cal.add(5,5));
    }
}