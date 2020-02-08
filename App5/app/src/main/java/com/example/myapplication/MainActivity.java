package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private GuessGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new GuessGame();
    }

    public void check(View v){
        EditText response = (EditText)findViewById(R.id.response);
        final TextView message = (TextView)findViewById(R.id.message);
        final TextView remainingGuess = (TextView)findViewById(R.id.remainingGuess);

        int guess = Integer.parseInt(response.getText().toString());
        int remaining = game.getGuesses();
        String userMessage = game.checkAnswer(guess);

        message.setText(userMessage);
        remainingGuess.setText(remaining+"");

        if(remaining == 0 || userMessage.equals("Correct!")){
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();

            // Set Custom Title
            TextView title = new TextView(this);
            // Title Properties
            title.setText("Game Over");
            title.setPadding(10, 10, 10, 10);   // Set Position
            title.setGravity(Gravity.CENTER);
            title.setTextColor(Color.BLACK);
            title.setTextSize(20);
            alertDialog.setCustomTitle(title);

            // Set Message
            TextView msg = new TextView(this);
            msg.setText("Would you like to play again?");
            msg.setGravity(Gravity.CENTER_HORIZONTAL);
            msg.setTextColor(Color.BLACK);
            alertDialog.setView(msg);

            // Set Buttons
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE,"YES", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    game.newGame();
                    message.setText("Guess a Number");
                    remainingGuess.setText("8");
                }
            });

            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE,"NO", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    System.exit(1);
                }
            });

            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"CANCEL", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // Game does nothing if user hits cancel
                }
            });

            new Dialog(getApplicationContext());
            alertDialog.show();

            // Set Properties for Cancel
            final Button cancel = alertDialog.getButton(AlertDialog.BUTTON_NEUTRAL);
            LinearLayout.LayoutParams neutral = (LinearLayout.LayoutParams) cancel.getLayoutParams();
            neutral.gravity = Gravity.FILL_HORIZONTAL;
            cancel.setPadding(50, 10, 10, 10);   // Set Position
            cancel.setTextColor(Color.BLUE);
            cancel.setLayoutParams(neutral);

            // Set Properties for No
            final Button no = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);
            LinearLayout.LayoutParams negative = (LinearLayout.LayoutParams) cancel.getLayoutParams();
            negative.gravity = Gravity.FILL_HORIZONTAL;
            no.setTextColor(Color.RED);
            no.setLayoutParams(negative);

            // Set Properties for Yes
            final Button yes = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
            LinearLayout.LayoutParams positive = (LinearLayout.LayoutParams) cancel.getLayoutParams();
            positive.gravity = Gravity.FILL_HORIZONTAL;
            yes.setTextColor(Color.BLUE);
            yes.setLayoutParams(positive);
        }
    }
}
