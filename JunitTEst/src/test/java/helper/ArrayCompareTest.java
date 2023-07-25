package helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayCompareTest {

    @Test
    public void testArraySort() {
        int[] number = {122, 3, 4, 1};
        int[] expected = {1, 3, 4, 122};                 // {1, 4, 3, 12};
        Arrays.sort(number);

        assertArrayEquals(expected, number);
    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray(){
        int[] number = {};                            // int[] number = {} ;
        Arrays.sort(number);

    }

    @Test()
    public void testArray(){
        int[] number = {};                            // int[] number = {} ;
        Arrays.sort(number);

    }

}
