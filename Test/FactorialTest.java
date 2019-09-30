import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void factorial() {
    }

    @org.junit.jupiter.api.Test
    void smallest() {
        Factorial factor = new Factorial();
        int expected = 14;
        int actual = factor.smallest();

        assertEquals(expected, actual);

    }
}