package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar red = (SeekBar) findViewById(R.id.redAmount);
        SeekBar green = (SeekBar) findViewById(R.id.greenAmount);
        SeekBar blue = (SeekBar) findViewById(R.id.blueAmount);

        ColorPicker listener = new ColorPicker();

        red.setOnSeekBarChangeListener(listener);
        green.setOnSeekBarChangeListener(listener);
        blue.setOnSeekBarChangeListener(listener);
    }

    private class ColorPicker implements SeekBar.OnSeekBarChangeListener {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            changeColor();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }

        private void changeColor(){
            TextView color = (TextView)findViewById(R.id.color);
            SeekBar red = (SeekBar) findViewById(R.id.redAmount);
            SeekBar green = (SeekBar) findViewById(R.id.greenAmount);
            SeekBar blue = (SeekBar) findViewById(R.id.blueAmount);

            int redValue = red.getProgress();
            int greenValue = green.getProgress();
            int blueValue = blue.getProgress();

            //sets background color of large textbox
            color.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
        }
        }
    }
