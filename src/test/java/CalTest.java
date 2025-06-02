import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void getMinus1() {
        var cal = new Cal();
        int expected = 5;

        var actual = cal.getMinus(10, 5);

        assertEquals(expected, actual);
    }

    @Test
    void getMinus2() {
        var cal = new Cal();
        int expected = -5;

        var actual = cal.getMinus(5, 10);

        assertEquals(expected, actual);
    }
}