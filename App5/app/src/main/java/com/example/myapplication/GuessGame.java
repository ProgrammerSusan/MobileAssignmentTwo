package com.example.myapplication;

import java.util.Random;

public class GuessGame {
    private int answer;
    private int guesses;

    public GuessGame(){
        Random r = new Random();
        this.answer = r.nextInt(100) + 1;
        this.guesses = 8;
    }

    public String checkAnswer(int response){
        String message;
        this.guesses--;
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

    public int getGuesses(){
        return guesses;
    }

    public void newGame(){
        Random r = new Random();
        answer = r.nextInt(100) + 1;
        guesses = 8;
    }
}
