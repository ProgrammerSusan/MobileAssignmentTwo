package com.example.myapplication;

import android.os.Build;
import android.view.*;
import android.widget.*;
import android.graphics.*;
import android.content.Context;
import android.util.TypedValue;

import androidx.annotation.RequiresApi;

import static android.graphics.Color.*;

class AppInterface extends GridLayout{
    private TextView[][] board;
    private TextView[][] goal;
    private int size, width;
    private Button up, down, right, left;
    private int upId, downId, rightId, leftId;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public AppInterface(Context context, View.OnClickListener buttonHandler, Slide slider)
    {
        super(context);

        this.size = 3;
        this.width = 50;

        final int dp = (int)(getResources().getDisplayMetrics().density);
        width = width * dp;
        setRowCount(size + 1);
        setColumnCount(size);

        //Get boards from slider
            char[][] initial = slider.generateInitialBoard();
            char[][] mission = slider.generateGoalBoard();

        //create first board in a grid
            board = new TextView[size][size];
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    board[i][j] = new TextView(context);
                    board[i][j].setText(initial[i][j]);
                    board[i][j].setTextSize((int)(size*2));
                    board[i][j].setBackgroundColor(Color.parseColor("#AEC4C0"));
                    board[i][j].setGravity(Gravity.CENTER);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                    params.width = width;
                    params.height = width;
                    params.rowSpec = GridLayout.spec(i,1);
                    params.columnSpec = GridLayout.spec(j, 1);
                    params.topMargin = params.bottomMargin = 1;
                    params.leftMargin = params.rightMargin = 1;
                    board[i][j].setLayoutParams(params);
                    addView(board[i][j]);

                }
            }

        //create second board in a grid
            goal = new TextView[size][size];
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    goal[i][j] = new TextView(context);
                    goal[i][j].setText(mission[i][j]);
                    goal[i][j].setBackgroundColor(Color.parseColor("#AEC4C0"));
                    goal[i][j].setGravity(Gravity.CENTER);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                    params.width = width;
                    params.height = width;
                    params.rowSpec = GridLayout.spec(i,1);
                    params.columnSpec = GridLayout.spec(j, 1);
                    params.topMargin = params.bottomMargin = 1;
                    params.leftMargin = params.rightMargin = 1;
                    goal[i][j].setLayoutParams(params);
                    addView(goal[i][j]);

                }
        }
        //create four buttons, attach event handler
            up = new Button(context);
            up.setId(Button.generateViewId());
            this.upId = up.getId();
            down = new Button(context);
            down.setId(Button.generateViewId());
            this.downId = down.getId();
            left = new Button(context);
            left.setId(Button.generateViewId());
            this.leftId = left.getId();
            right = new Button(context);
            right.setId(Button.generateViewId());
            this.rightId = right.getId();
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
