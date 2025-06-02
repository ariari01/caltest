import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {

    @Test
    void testDivide() {
        Cal cal = new Cal();
        assertEquals(2, cal.getDivide(10, 5));
    }
}
