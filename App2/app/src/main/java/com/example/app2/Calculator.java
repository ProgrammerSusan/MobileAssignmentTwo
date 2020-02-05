package com.example.app2;
public class Calculator
{
    public static double cost(double price)
    {
        double temp = price;
        if(MainActivity.warranty)
            price = price + (temp * 0.01);
        if(MainActivity.insurance)
            price = price + (temp * 0.05);
        switch(MainActivity.delivery)
        {
            case"Next Day":
                price=price+20;
                break;
            case"Second Day":
                price=price+10;
                break;
            default:
                price=price+5;
                break;
        }
        return price;
    }


}
