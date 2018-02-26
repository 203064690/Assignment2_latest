package com.Dylan;

import com.Modulus.Modulus;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

import static com.Modulus.Modulus.modulus;
import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class ModulusTest

{
    @Test
    public void test() throws Exception {
        Modulus add = new Modulus();
        int result =modulus(8, 4);
        assertEquals(0, result);
    }


    @Test
    public void TestFail() throws Exception {
        Modulus add = new Modulus();
        int result =modulus(4, 3);
        assertEquals(4, result);
    }

    @Test(timeout=1000)
    public void TestTimeout(){
        Modulus add = new Modulus();
        int result =modulus(4, 5);
        assertEquals(4, result);
    }


    @Ignore
    public void ignoreTest(){
        Modulus add = new Modulus();
        int result =modulus(4, 5);
        assertEquals(4, result);
    }


}
