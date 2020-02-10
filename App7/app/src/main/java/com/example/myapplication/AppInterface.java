package com.example.myapplication;

import android.view.Gravity;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.content.Context;
import android.view.View;
import android.widget.GridLayout;
import android.util.TypedValue;

class AppInterface {
    private TextView[][] board;
    private TextView[][] goal;
    private Button up, down, right, left;

    public AppInterface(Context context, View.OnClickListener buttonHandler)
    {
        //create first board in a grid

        //create second board in a grid

        //create four buttons, attach event handler
    }

    public void drawBoard(char[][] board)
    {
        //draw current board
    }

    public void drawGoal(char[][] goal)
    {
        //draw goal board
    }

    public int findButton(Button button)
    {
        if (button == up)
            return 1;
        else if (button == down)
            return 2;
        else if (button == right)
            return 3;
        else
            return 4;
    }
}
