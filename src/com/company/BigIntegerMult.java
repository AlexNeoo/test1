
package com.company;

import java.math.BigInteger;

public class BigIntegerMult {

    public static String mult(String str1, String str2 )
    {
        // BigInteger object to store result
        BigInteger mult;
        // Convert the string input to BigInteger
        BigInteger a = new BigInteger(str1);
        BigInteger b = new BigInteger(str2);

        // Using multiply() method
        mult = a.multiply(b);

        // Display the result in BigInteger

        return  String.valueOf(mult);
    }
}
