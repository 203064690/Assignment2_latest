package com.Dylan;


import com.Div.Divide;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

import static com.Div.Divide.div;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit test for simple App.
 */
public class DivideTest

{
    String name;

    @Test
    public void test() throws Exception {
        Divide add = new Divide();
        int result =div(4, 2);
        assertEquals(2, result, 0);
    }
    @Test
    public void TestFail(){
        Divide add = new Divide();
        int result =div(4, 2);
        assertEquals(7, result, 0);
    }

    @Test(timeout=1000)
    public void TestTimeout(){
        Divide add = new Divide();
        int result =div(4, 2);
        assertEquals(2, result, 0);
    }

    @Test
    public void TestFailure(){
        fail("Testing failure");
    }

    @Test(expected = ArithmeticException.class)
    public void TestException() throws Exception{
        Divide add = new Divide();
        int result =div(4, 0);
        assertEquals(7, result);
    }

    @Ignore
    public void ignoreTest(){
        Divide add = new Divide();
        int result =div(4, 5);
        assertEquals(7, result, 0);
    }

}
