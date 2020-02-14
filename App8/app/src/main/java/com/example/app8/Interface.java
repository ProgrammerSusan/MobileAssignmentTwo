package com.example.app8;

import android.graphics.Color;
import android.os.Build;
import android.widget.*;
import android.util.*;
import android.view.*;
import android.content.*;
import androidx.annotation.RequiresApi;


public class Interface extends GridLayout
{
    private int size;
    private static EditText[][] box;
    private TextView status;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public Interface(Context context, int size, int width)
    {
        super(context);

        this.size = 9;
        setRowCount(size);
        setColumnCount(size);

        //getting board info from blackbox
        int[][] board = Model.makeboard();

        //setup and population of board
        box = new EditText[size][size];
        for(int i = 0; i<size;i++)
        {
            for(int j = 0; j<size; j++)
            {
                box[i][j] = new EditText(context);
                if(board[i][j]==0)
                    box[i][j].setBackgroundColor(Color.parseColor("#E0E4E3"));
                else
                {
                    box[i][j].setBackgroundColor(Color.parseColor("#AEC4C0"));
                    box[i][j].setText(board[i][j]+"");
                    box[i][j].setEnabled(false);
                }
                box[i][j].setTextColor(Color.parseColor("#000000"));
                box[i][j].setTextSize((int)(size*2));
                box[i][j].setGravity(Gravity.CENTER);
                GridLayout.LayoutParams params = new GridLayout.LayoutParams();
                params.width = width;
                params.height = width;
                params.rowSpec = GridLayout.spec(i,1);
                params.columnSpec = GridLayout.spec(j, 1);
                params.topMargin = params.bottomMargin = 1;
                params.leftMargin = params.rightMargin = 1;
                box[i][j].setLayoutParams(params);
                addView(box[i][j]);
            }
        }
    }

    //to clear a board space
    public void clear(int x, int y)
    {
        Model.setBoard(x,y,0);
        box[x][y].setText("");
    }

    //method called from controller to get the handlers attached
    public static void setHandler(int n, int p, MainActivity.TextChangeHandler handler)
    {
        //Log.d("Debugger","X is "+ n);
        //Log.d("Debugger","Y is "+ p);
        //Log.d("Debugger",""+box[n][p].getText().toString());
        box[n][p].addTextChangedListener(handler);
    }
}