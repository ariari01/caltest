import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalTest {

    @Test
    void getDivide() {
        Cal cal = new Cal();

        int expected = 2;
        int autual = cal.getDivide(10, 5);
        assertEquals(expected, autual);
    }
}
