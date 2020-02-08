package com.example.myapplication;

import java.util.Random;

public class GuessGame {
    private int answer;

    public GuessGame(){
        Random r = new Random();
        this.answer = r.nextInt(100) + 1;
    }

    public String checkAnswer(int response){
        String message;
        if(response == answer){
            message = "Correct!";
        }
        else if(response < answer){
            message = "Number is greater than guess";
        }
        else{
            message = "Number is less than guess";
        }
        return message;
    }
}
