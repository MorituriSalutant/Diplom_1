import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    Ingredient ingredient;

    @Before
    public void setUp() {
        ingredient = new Ingredient(IngredientType.SAUCE, "Мазик", 12.15f);
    }

    @Test
    public void whenCallGetPriceThenReturnFloatTest() {
        float expect = 12.15f;

        float actual = ingredient.getPrice();

        assertEquals(expect, actual, 0);
    }

    @Test
    public void whenCallGetNameThenReturnStringTest() {
        String expect = "Мазик";

        String actual = ingredient.getName();

        assertEquals(expect, actual);
    }

    @Test
    public void whenCallGetTypeThenReturnIngredientTypeTest() {
        IngredientType expect = IngredientType.SAUCE;

        IngredientType actual = ingredient.getType();

        assertEquals(expect, actual);
    }
}
