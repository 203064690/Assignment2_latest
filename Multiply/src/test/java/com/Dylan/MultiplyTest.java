package com.Dylan;

import com.Multiply.Multiply;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

import static com.Multiply.Multiply.multiply;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit test for simple App.
 */
public class MultiplyTest

{
    String name;

    @Test
    public void test() throws Exception {
        Multiply add = new Multiply();
        int result =multiply(4, 5);
        assertEquals(20, result, 0);
    }
    @Test
    public void TestFail(){
        Multiply add = new Multiply();
        int result =multiply(4, 5);
        assertEquals(7, result, 0);
    }

    @Test(timeout=1000)
    public void TestTimeout(){
        Multiply add = new Multiply();
        int result =multiply(4, 5);
        assertEquals(20, result, 0);
    }

    @Test
    public void TestFailure(){
        fail("Testing failure");
    }



    @Ignore
    public void ignoreTest(){
        Multiply add = new Multiply();
        int result =multiply(4, 5);
        assertEquals(20, result, 0);
    }

}
