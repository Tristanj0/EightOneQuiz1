 

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopFunFactorialTest {
    private LoopFun loop;

    @Before
    public void setUp() {
        loop = new LoopFun();
    }

    @Test
    public void testFactorialBase() {
        //Given
        int number = 1;
        int expected = 1;

        //When
         int actual = 1;

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void testFactorialOfSmallNumber() {
        //Given
        int number = 3;
        int expected = 6;

        //When
        int actual = 6;

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void testFactorialOfBigNumber() {
        //Given
        int number = 6;
        int expected = 720;

        //When
        int actual = 720;

        //Then
        assertEquals(expected, actual);

    }

}
