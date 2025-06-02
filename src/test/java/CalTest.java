import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void getGop1() {
        var cal = new Cal();
        int expected = 15;

        var actual = cal.getGop(3, 5);

        assertEquals(expected, actual);
    }
}