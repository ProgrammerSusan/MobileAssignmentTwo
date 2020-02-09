package com.example.app8;

import android.graphics.Color;
import android.os.Build;
import android.text.InputType;
import android.widget.*;
import android.widget.RelativeLayout;
import android.view.*;
import android.content.*;
import android.util.*;
import androidx.annotation.RequiresApi;


public class Interface extends GridLayout
{
    private int size;
    private Button[][] buttons;
    private TextView status;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public Interface(Context context, int size, int width, View.OnClickListener textHandler)
    {
        super(context);

        this.size = 9;
        setRowCount(size);
        setColumnCount(size);

        buttons = new Button[size][size];
        for(int i = 0; i<size;i++)
        {
            for(int j = 0; j<size; j++)
            {
                buttons[i][j] = new Button(context);
                buttons[i][j].setBackgroundColor(Color.parseColor("#E0E4E3"));
                buttons[i][j].setTextColor(Color.parseColor("#000000"));
                buttons[i][j].setTextSize((int)(size*0.2));
                buttons[i][j].setGravity(Gravity.CENTER);
                buttons[i][j].setOnClickListener(textHandler);
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.width = width;
                params.height = width;
                params.rowSpec = GridLayout.spec(i,1);
                params.columnSpec = GridLayout.spec(j, 1);
                params.topMargin = params.bottomMargin = 1;
                params.leftMargin = params.rightMargin = 1;
                buttons[i][j].setLayoutParams(params);
                addView(buttons[i][j]);
            }
        }
    }
}