package com.company;

public class TestJavaAplication {

    public static void main(String[] args)
    {
        String algoritm = "";
        String input1 = "";
        String input2 = "";

        //saving command line parameters
        if(args.length == 3) {
            algoritm = args[0];
            input1 = args[1];
            input2 = args[2];
        }

        //checking input data
        if(input1.matches("[0-9]+") && input2.matches("[0-9]+") && input1.length() > 0
                && input2.length() > 0 )

        {
            System.out.println("Input Data is ok!");
        }
        else{
            System.out.println("Non numerical input data provided!");
            System.exit(2);
        }

        //calculating product with chosen algorithm
        if (algoritm.equals("-algorithm1"))
        {
            String output = BigIntegerMult.mult(input1, input2);
            System.out.println("The BigInteger multiplication of\n"
                + input1 + " \nand\n" + input2 + " "
                + "\nis\n" + output);
        }
        else {
            String output = StringMultiplication.mult(input1, input2);
            System.out.println("The string algorithm multiplication of\n"
                    + input1 + " \nand\n" + input2 + " "
                    + "\nis\n" + output);
        }
    }
}