package com.Dylan;

import org.junit.Test;

import static com.Dylan.Subtract.subtract;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by dylanb on 26/02/2018.
 */
public class SubtractTest {

    String name;

    @Test
    public void test() throws Exception {
        Subtract add = new Subtract();
        int result = subtract(8, 5);
        assertEquals(3, result, 0);
    }
    @Test
    public void TestFail(){
        Subtract add = new Subtract();
        int result =subtract(8, 5);
        assertEquals(7, result, 0);
    }

    @Test(timeout=1000)
    public void TestTimeout(){
        Subtract add = new Subtract();
        int result =subtract(8, 5);
        assertEquals(3, result, 0);
    }

    @Test
    public void TestFailure(){
        fail("Testing failure");
    }

    @Test(expected = ArithmeticException.class)
    public void TestException() throws Exception {
        Subtract add = new Subtract();
        int result = subtract(8, 0);
        assertEquals(3, result);
    }

}