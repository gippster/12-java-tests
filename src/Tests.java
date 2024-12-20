
import org.junit.Test;
import java.lang.Integer;
import static org.junit.Assert.*;

public class Tests
{
    @Test(expected = NumberFormatException.class)
    public void checkZeroLenght()
    {
        Integer.decode("");
    }

    @Test
    public void testPositiveNumber()
    {
        assertEquals(Integer.decode("123"),
                Integer.valueOf(123));
    }

    @Test
    public void checkNegative()
    {
        assertEquals(Integer.decode("-1444"),
                Integer.valueOf(-1444));
    }

    @Test(expected = NumberFormatException.class)
    public void checkUnCorrectEightBase(){
        Integer.decode("009");
    }

    @Test
    public void checkHexBase(){
        assertEquals(Integer.decode("0x5d0"), (Integer) 1488);
    }

    @Test
    public void checkNegativeEightBase(){
        assertEquals(Integer.decode("-0354"),
                Integer.valueOf(-236));
    }

    @Test(expected = NullPointerException.class)
    public void testNull()
    {
        Integer.decode(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testNotANumber()
    {
        Integer.decode("lsd");
    }
}
