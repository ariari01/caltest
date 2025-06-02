import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalTest {

    @Test
    @DisplayName("getSum 2,3")
    void getSum() {
        Cal cal = new Cal();
        int expect = 5;

        int actual = cal.getSum(2, 3);

        assertEquals(expect, actual);
    }
}