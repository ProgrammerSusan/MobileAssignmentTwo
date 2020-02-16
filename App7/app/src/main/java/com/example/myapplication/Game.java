package com.example.myapplication;

import android.view.View;
import android.widget.GridLayout;
import android.content.Context;

class Game {
    private char[][] board;
    private char[][] goal;
    private int x, y;
    private int [] blank;
    private int size;

    public Game(int size)
    {
        this.size = size;
        //create Slide object
            Slide slider = new Slide();
        //create initial and goal boards

        //determine the location of blank
    }

    public char[][] getBoard()
    {
        //return current board
        return board;
    }

    public char[][] getGoal()
    {
        //return goal board
        return goal;
    }

    public void up()
    {
        //move blank up
        if(blank[1] != 0){

        }
    }

    public void down()
    {
        //move blank down
    }

    public void right()
    {
        //move blank right
    }

    public void left()
    {
        //move blank left
    }
}
