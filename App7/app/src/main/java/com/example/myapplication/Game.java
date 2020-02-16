package com.example.myapplication;

import android.view.View;
import android.widget.GridLayout;
import android.content.Context;

class Game extends GridLayout {
    private char[][] board;
    private char[][] goal;
    private int x, y;

    public Game(Context context, View.OnClickListener buttonHandler)
    {
        super(context);
        //create Slide object
            Slide slider = new Slide();
        //create initial and goal boards
            AppInterface board = new AppInterface(context, buttonHandler, slider);
        //determine the location of blank
    }

    public char[][] getBoard()
    {
        //return current board
    }

    public char[][] getGoal()
    {
        //return goal board
    }

    public void up()
    {
        //move blank up
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
