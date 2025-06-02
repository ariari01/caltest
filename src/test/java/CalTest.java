import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {
    @Test
    @DisplayName("getSumSum 1,2,3")
    void getSumSumTest() {
        Cal cal = new Cal();
        int expected = 6;

        int actual = cal.getSumSum(1,2,3);

        assertEquals(expected, actual);
    }
}