package com.example.app6;

public class Model
{
    public static boolean isPrime(int number)
    {
        boolean answer = false;
        for(int i = 2; i < number; i++)
        {
            if(number%i == 0)
            {
                answer = false;
                break;
            }
            else
                answer = true;
        }
            if (number == 2)
                answer = true;
        return answer;
    }

}
