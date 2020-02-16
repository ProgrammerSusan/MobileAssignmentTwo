package com.example.myapplication;

import android.view.View;
import android.widget.GridLayout;
import android.content.Context;

class Game {
    private char[][] board;
    private char[][] goal;
    private int x, y;
    private int [] blank;

    public Game()
    {
        //create Slide object
            Slide slider = new Slide();
        //create initial and goal boards
            board = slider.generateInitialBoard();
            goal = slider.generateGoalBoard();
        //determine the location of blank
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board.length; j++){
                    if(board[i][j] == ' '){
                        x = i;
                        y = j;
                    }
                }
            }
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
