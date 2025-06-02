import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalTest {

    @Test
    void getDivide() {
        Cal cal = new Cal();
        assertEquals(2, cal.getDivide(10, 5));
    }
}
