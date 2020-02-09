package com.example.app6;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

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
            EditText inp = (EditText) findViewById(Interface.inputID);
            TextView output = (TextView) findViewById((Interface.outputID));
            String in = inp.getText().toString();
            int number = Integer.parseInt(in);
            if (Model.isPrime(number))
                output.setText(number+" is Prime");
            else
                output.setText(number+" is not Prime");
        }
    }

}
