package com.Dylan;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

import static com.Dylan.App.CompareString;
import static com.Dylan.App.addition;
import static org.junit.Assert.assertEquals;

/**
 * Created by dylanb on 26/02/2018.
 */
public class AppTest {
    @Test
    public void test() throws Exception {
        App add = new App();
        int result =addition(4, 5);
        assertEquals(9, result, 0);
    }


    @Test
    public void TestFail() throws Exception {
        App add = new App();
        int result =addition(4, 5);
        assertEquals(7, result, 0);
    }

    @Test(timeout=1000)
    public void TestTimeout(){
        App add = new App();
        int result =addition(4, 5);
        assertEquals(9, result, 0);
    }


    @Ignore
    public void ignoreTest(){
        App add = new App();
        int result =addition(4, 5);
        assertEquals(7, result, 0);
    }

    @Test
    public void CompareTwoStringTest() {
        App add = new App();
        String str1 = CompareString("Dylan", "Baadjies");
        String str2 = "Dylan Baadjies";
        assertEquals(str2,str1);
    }

}