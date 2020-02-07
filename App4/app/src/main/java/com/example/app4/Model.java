package com.example.app4;

public class Model
{
    //setting up variables
    public static double[] numbers;
    public static String[] temp;
    //taking number string id's from controller
    public static String sum = MainActivity.sum;
    public static String mean = MainActivity.mean;
    public static String median = MainActivity.med;
    public static String stdv = MainActivity.stdv;
    public static String min = MainActivity.min;
    public static String max = MainActivity.max;

    public static String identify(String operation)
    {
        //comparing number strings and replaciing the operation
        //variable with a word so we know which operation to preform
        if (operation.equals(sum))
            operation = "sum";
        else if (operation.equals(mean))
            operation="mean";
        else if (operation.equals(median))
            operation="median";
        else if (operation.equals(stdv))
            operation="stdv";
        else if (operation.equals(min))
            operation="min";
        else
            operation="max";

        return operation;
    }

    public static void getValues(String input)
    {
        //gets the string of input values from controller and creates a
        //double array with them so we can manipulate the data
        temp = input.split(" ");
        for (int i = 0; i < temp.length; i++)
        {
            numbers[i] = Double.parseDouble(temp[i]);
        }
    }

    public static double calculate(String operation, String input)
    {
        double answer = 0;
        identify(operation);
        return answer;
    }
}
