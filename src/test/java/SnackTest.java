import org.example.Vending_Machine.Snack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnackTest {
    Snack coke = new Snack("Coke", 2.99, 1);

    @Test
    public void testCoke() {
        String expected = "Coke";
        String actual = coke.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testCokePrice() {
        double expected = 2.99;
        double actual = coke.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testCokeQuantity() {
        int expected = 1;
        int actual = coke.getQuantity();
        assertEquals(expected, actual);
    }

}
