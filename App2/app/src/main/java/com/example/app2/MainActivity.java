package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    //initializing variables
    public static double price;
    public static boolean warranty, insurance;
    public static String delivery;

    public void onClick(View v)
    {
        //pulling from xml and setting them to useful variables
        EditText p = (EditText) findViewById(R.id.price);
            String pr = p.getText().toString();
            price = Integer.parseInt(pr);
        ToggleButton warr = (ToggleButton) findViewById(R.id.warranty);
            warranty = warr.isChecked();
        Switch ins = (Switch) findViewById(R.id.ins);
            insurance = ins.isChecked();
        Spinner del = (Spinner) findViewById(R.id.del);
            delivery = del.getSelectedItem().toString();
        TextView cost = (TextView) findViewById(R.id.cost);
        //pulling final cost from model and throwing it to view
            price = Calculator.cost(price);
            cost.setText(price+"");
    }

    public void initialize()
    {
        //this was the only way I could think to get the spinner options up without re making
        //them for every calculate button push
        Spinner delivery = (Spinner) findViewById(R.id.del);
        //heavy assistance from
        //https://developer.android.com/guide/topics/ui/controls/spinner#java
        //for the next four lines
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.deliveryOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        delivery.setAdapter(adapter);
        //end assistance
        Button calc = (Button) findViewById(R.id.calc);
        calc.setOnClickListener(this);
    }
}
