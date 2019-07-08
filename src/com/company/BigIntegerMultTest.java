package com.company;

import org.junit.*;

public class BigIntegerMultTest {

    @Test
    public void mult() {
        //test data
        String num2 = "12345678901234567890";

        String[] num1 = new String[5];
        num1[0] = "0";
        num1[1] = "1";
        num1[2] = "10000000000000000000";
        num1[3] = "10000000000000000001";
        num1[4] = "12345678901234567890";

        String[] expected = new String[5];
        expected[0] = "0";
        expected[1] = "12345678901234567890";
        expected[2] = "123456789012345678900000000000000000000";
        expected[3] = "123456789012345678912345678901234567890";
        expected[4] = "152415787532388367501905199875019052100";

        for (int i = 0; i < 5; i++ )
        {
            String actual = BigIntegerMult.mult(num1[i], num2);
            Assert.assertEquals(expected[i], actual);
        }
    }
}