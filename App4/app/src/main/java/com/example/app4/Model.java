package com.example.app4;

import java.util.*;

public class Model
{
    //setting up variables
    public static double[] numbers;
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
        String[] temp = input.split(" ");
        numbers = new double[temp.length];
        for (int i = 0; i < temp.length; i++)
        {
            numbers[i] = Double.parseDouble(temp[i]);
        }
    }

    public static double calculate(String operation, String input)
    {
        //setup
        double answer = 0;
        String method = identify(operation);
        getValues(input);
        //actual calculation
        switch(method)
        {
            case "sum":
                for(int i = 0; i < numbers.length; i++)
                {
                    answer = answer + numbers[i];
                }
                break;

            case "mean":
                for(int i = 0; i < numbers.length; i++)
                {
                    answer = answer + numbers[i];
                }
                answer = answer/numbers.length;
                break;

            case "median":
                Arrays.sort(numbers);
                answer = numbers[numbers.length/2];
                break;

            case "stdv":
                //temp array
                double[] temp = new double[numbers.length];
                //sum of all values
                for(int i = 0; i < numbers.length; i++)
                    answer = answer + numbers[i];
                //division of number of values
                answer = answer/numbers.length;
                for(int j = 0; j < numbers.length; j++)
                    temp[j] = numbers[j]-answer;
                //subtract mean from each value
                for(int k = 0; k < numbers.length; k++)
                    answer = answer + temp[k];
                //square root the average of those means
                answer = Math.sqrt(answer/numbers.length);
                break;

            case "min":
                Arrays.sort(numbers);
                answer = numbers[0];
                break;

            case "max":
                Arrays.sort(numbers);
                answer = numbers[numbers.length-1];
                break;
        }
        return answer;
    }
}
