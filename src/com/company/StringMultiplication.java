package com.company;
// Java program to multiply two numbers represented as strings.

public class StringMultiplication
{
    public static String mult(String num1, String num2 )
    {

        //create string numbers in reverse order
        String s1 = new StringBuffer(num1).reverse().toString();
        String s2 = new StringBuffer(num2).reverse().toString();

        int[] m = new int[s1.length()+s2.length()];

        // Using "umnozhenie v stolbik" algorithm
        // Multiply with current digit of the first number
        // all digits of the second number
        // and add result to previously stored product
        // at current decimal position.

        for (int i = 0; i < s1.length(); i++)
        {
            // Go from right to left in num2
            for (int j = 0; j < s2.length(); j++)
            {
                m[i+j] = m[i+j]+(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
            }
        }

        //calculate all digits of product string
        String product = "";

        for (int i = 0; i < m.length; i++)
        {
            int digit = m[i]%10;
            int carry = m[i]/10;

            if(i+1<m.length)
            {
                m[i+1] = m[i+1] + carry;
            }
            product = digit + product;
        }

        // remove unnecessary '0's from the left of product string
        while(product.length()>1 && product.charAt(0) == '0')
        {
            product = product.substring(1);
        }
        return product;
    }
}