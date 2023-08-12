package helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayCompareTest {

    // Comparing Arrays in Junit test :
    @Test
    public void testArraySort() {
        int[] number = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};                 // {1, 4, 3, 12};
        Arrays.sort(number);

        assertArrayEquals(expected, number);
    }

    // Testing Exception in Junit test :
    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray(){
        int[] number = null;                            // int[] number = {} ;
        Arrays.sort(number);

    }

    // Testing Performance in Junit test :
    @Test(timeout = 100)
    public void testArraySort_Performance(){
        int[] arr = {12, 23, 4};
        for(int i=0; i<10000; i++){
            arr[0] = i;
            Arrays.sort(arr);
        }
    }

}
