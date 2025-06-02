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

    @Test
    void getMinus1() {
        Cal cal = new Cal();
        int expected = 5;

        int actual = cal.getMinus(10, 5);
      
        assertEquals(expected, actual);
    }
  
    @Test
    void getMinus2() {
        Cal cal = new Cal();
        int expected = -5;

        int actual = cal.getMinus(5, 10);

        assertEquals(expected, actual);
    }
  
    @Test
    @DisplayName("getSumSum 1,2,3")
    void getSumSumTest() {
        Cal cal = new Cal();
        int expected = 6;

        int actual = cal.getSumSum(1,2,3);

        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("제곱하는 기능 성공")
    void getZegopSuccess() {
        Cal app = new Cal();

        int input = 3;
        int expected = 9;

        assertEquals(expected, app.getZegop(input));
    }


    @Test
    @DisplayName("제곱하는 기능 실패")
    void getZegopFail() {
        Cal app = new Cal();

        int input = 4;
        int expected = 9;

        assertNotEquals(expected, app.getZegop(input));
    }



    @Test
    @DisplayName("getSumSum 1,2,3")
    void getGop1() {
        var cal = new Cal();
        int expected = 15;

        var actual = cal.getGop(3, 5);
    }

}