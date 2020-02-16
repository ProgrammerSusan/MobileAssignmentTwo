package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Game game;
    private final int SIZE = 3;
    private AppInterface appInterface;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Point screenSize = new Point();
        getWindowManager().getDefaultDisplay().getSize(screenSize);
        int width = screenSize.x/SIZE;
        //create event handler
        ButtonHandler button = new ButtonHandler();
        //create game
            game = new Game(SIZE);
        //create interface
            AppInterface ui = new AppInterface()
        //draw initial and goal board
    }

    public class ButtonHandler implements Button.OnClickListener
    {
        public void onClick(View view)
        {
            //find out which button was clicked

            //make move in the board

            //draw updated board
        }
    }
}
