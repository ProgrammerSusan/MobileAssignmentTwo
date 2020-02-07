package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    //variable setup
    public String numbers;
    public String display;
    public static String sum;
    public static String mean;
    public static String med;
    public static String stdv;
    public static String min;
    public static String max;

    public void onClick(View v)
    {
        //on click grab the input, operation, and output info
        String operation = Integer.toString(v.getId());
        TextView output = (TextView) findViewById(R.id.display);
        numbers = output.getText().toString();

        display = "The "+Model.identify(operation)+" is "+sum; //+Model.calculate(operation, numbers);

        output.setText(display);
    }

    public void initialize()
    {
        //when the app starts up, connect all the listeners to each
        //button and give their ID's to be used in the Model
        Button add = (Button) findViewById(R.id.sum);
            sum = Integer.toString(add.getId());
            add.setOnClickListener(this);
        Button mn = (Button) findViewById(R.id.mean);
            mean = Integer.toString(mn.getId());
            mn.setOnClickListener(this);
        Button md = (Button) findViewById(R.id.med);
            med = Integer.toString(md.getId());
            md.setOnClickListener(this);
        Button sd = (Button) findViewById(R.id.sd);
            stdv = Integer.toString(sd.getId());
            sd.setOnClickListener(this);
        Button mi = (Button) findViewById(R.id.min);
            min = Integer.toString(mi.getId());
            mi.setOnClickListener(this);
        Button mx = (Button) findViewById(R.id.max);
            max = Integer.toString(mx.getId());
            mx.setOnClickListener(this);
    }
}
