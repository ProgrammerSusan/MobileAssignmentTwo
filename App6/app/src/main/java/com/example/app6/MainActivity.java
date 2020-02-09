package com.example.app6;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    Model model;
    Interface ainterface;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        model = new Model();
        ButtonHandler buttonHandler = new ButtonHandler();
        ainterface = new Interface(this, buttonHandler);
        setContentView(ainterface);
    }

    private class ButtonHandler implements View.OnClickListener
    {
        public void onClick(View v)
        {

        }
    }

}
