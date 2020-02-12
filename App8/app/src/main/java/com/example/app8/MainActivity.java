package com.example.app8;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.graphics.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.*;

import java.lang.*;

public class MainActivity extends AppCompatActivity
{
    private Interface ainterface;
    private Model model;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        model = new Model();
        Point screenSize = new Point();
        getWindowManager().getDefaultDisplay().getSize(screenSize);
        int width = screenSize.x/9;

        //dispersing all 81 listeners
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j<9; j++)
            {
                TextChangeHandler temp = new TextChangeHandler(i, j);
                Interface.setHandler(i, j, temp);
            }
        }

        ainterface = new Interface(this, 9, width);

        setContentView(ainterface);

    }

    public class TextChangeHandler implements TextWatcher
    {
        //build textlistener
        //this is so we know the location
        public int x,y;
        public TextChangeHandler(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        //these two classes are here because they have to be
        public void beforeTextChanged(CharSequence c, int i, int j, int k){}
        public void onTextChanged(CharSequence c, int i, int j, int k){}

        //what we're really interested in; the stuff handler
        public void afterTextChanged(Editable e)
        {
            int xcoord = x;
            int ycoord = y;
            int input = Integer.parseInt(e.toString());

            //error handling
        }
    }
}
