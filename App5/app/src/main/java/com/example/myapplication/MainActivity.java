package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
        TextView message = (TextView)findViewById(R.id.message);
        TextView remainingGuess = (TextView)findViewById(R.id.remainingGuess);

        int guess = Integer.parseInt(response.getText().toString());
        String userMessage = game.checkAnswer(guess);

        message.setText(userMessage);
        remainingGuess.setText(game.getGuesses()+"");
    }
}
