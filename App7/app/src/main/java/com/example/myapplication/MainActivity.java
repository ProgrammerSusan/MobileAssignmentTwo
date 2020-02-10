package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Game game;
    private AppInterface appInterface;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //create game

        //create event handler

        //create interface

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
