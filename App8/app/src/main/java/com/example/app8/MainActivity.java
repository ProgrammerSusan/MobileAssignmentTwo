package com.example.app8;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.graphics.*;
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

        TextHandler textHandler = new TextHandler();

        ainterface = new Interface(this, 9, width, textHandler);

        setContentView(ainterface);

    }

    private class TextHandler implements View.OnClickListener
    {
        public void onClick(View V)
        {
            //int row = ainterface.getRow((EditText)v);
            //int column = ainterface.getColumn((EditText)v);


        }
    }
}
