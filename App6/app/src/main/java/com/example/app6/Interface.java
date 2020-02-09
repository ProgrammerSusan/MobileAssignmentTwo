package com.example.app6;

import android.graphics.Color;
import android.os.Build;
import android.widget.*;
import android.widget.RelativeLayout;
import android.view.*;
import android.content.*;
import android.util.*;
import androidx.annotation.RequiresApi;


public class Interface extends RelativeLayout
{
    public EditText input;
    public TextView output;
    public Button Submit;
    public int inputID, outputID;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public Interface(Context context, View.OnClickListener buttonHandler)
    {
        super(context);

        final int dp = (int)(getResources().getDisplayMetrics().density);

        EditText input = new EditText(context);
        input.setId(EditText.generateViewId());
        inputID = input.getId();
        input.setTextColor(Color.parseColor("#000000"));
        input.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        input.setPadding(15*dp, 15*dp, 15*dp, 15*dp);
        input.setHint("Enter Number Here");
        input.setBackgroundColor(Color.parseColor("#E0E4E3"));
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(0,0);
        params.width = 350*dp;
        params.height = LayoutParams.WRAP_CONTENT;
        params.topMargin = 120*dp;
        params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        input.setLayoutParams(params);
        addView(input);

        TextView output = new TextView(context);
        output.setId(TextView.generateViewId());
        outputID = output.getId();
        output.setTextColor(Color.parseColor("#000000"));
        output.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
        output.setPadding(15*dp, 15*dp, 15*dp, 15*dp);
        output.setBackgroundColor(Color.parseColor("#B5AEC4"));
        params = new RelativeLayout.LayoutParams(0,0);
        params.width = 350*dp;
        params.height = LayoutParams.WRAP_CONTENT;
        params.topMargin = 20*dp;
        params.addRule(RelativeLayout.BELOW, input.getId());
        params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        output.setLayoutParams(params);
        addView(output);

        Button submit = new Button(context);
        submit.setId(Button.generateViewId());
        submit.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        submit.setPadding(15*dp, 15*dp, 15*dp, 15*dp);
        submit.setText("SUBMIT");
        params = new RelativeLayout.LayoutParams(0,0);
        params.width = LayoutParams.WRAP_CONTENT;
        params.height = LayoutParams.WRAP_CONTENT;
        params.topMargin = 20*dp;
        params.addRule(RelativeLayout.BELOW, output.getId());
        params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        submit.setLayoutParams(params);
        submit.setOnClickListener(buttonHandler);
        addView(submit);
    }
}
