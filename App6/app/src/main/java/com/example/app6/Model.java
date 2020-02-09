package com.example.app6;

public class Model
{
    public static boolean isPrime(int number)
    {
        //initialize answer to false
        boolean answer = false;
        //2 is a prime number, otherwise test if the number
        //is divisible by 2 and up; if yes, not prime
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
