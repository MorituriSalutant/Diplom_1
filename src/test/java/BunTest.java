import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    Bun bun;

    @Before
    public void setUp() {
        bun = new Bun("Хлеб", 123.45f);
    }

    @Test
    public void whenCallGetNameThenReturnStringTest() {
        String expect = "Хлеб";

        String actual = bun.getName();

        assertEquals(expect, actual);
    }

    @Test
    public void whenCallGetPriceThenReturnFloatTest() {
        float expect = 123.45f;

        float actual = bun.getPrice();

        assertEquals(expect, actual, 0);
    }
}
