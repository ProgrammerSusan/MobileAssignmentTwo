package com.example.app2;
public class Calculator
{
    public static double cost(double price)
    {
        //i made a temp for the price just to be safe with calculations
        double temp = price;
        //if theres warrenty, calculate then tack that to total
        if(MainActivity.warranty)
            price = price + (temp * 0.01);
        //if theres insurance, calculate then tack that to total
        if(MainActivity.insurance)
            price = price + (temp * 0.05);
        //switch statement to handle the delivery options
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
        //give the final price back to the controller
        return price;
    }


}
