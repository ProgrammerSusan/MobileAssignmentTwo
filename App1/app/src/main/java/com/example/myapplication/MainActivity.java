package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    private class processInput implements  View.OnClickListener {
        
        @Override
        public void onClick(View v) {
            calculateGrade();
        }

        private void calculateGrade(){
            EditText programs = (EditText)findViewById(R.id.programScore);
            EditText midterm = (EditText)findViewById(R.id.midtermScore);
            EditText finalGrade = (EditText)findViewById(R.id.finalScore);
            int assignmentsScore = 0;
            int midtermScore = 0;
            int finalScore = 0;
            boolean validInput = true;
            try {
                assignmentsScore = Integer.parseInt(programs.getText().toString());
                if(assignmentsScore > 200){
                    throw new Exception();
                }
            }
            catch(Exception e){
                validInput = false;
                Context context = getApplicationContext();
                CharSequence text = "Invalid Assignments Score";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            try {
                midtermScore = Integer.parseInt(midterm.getText().toString());
                if(midtermScore > 200){
                    throw new Exception();
                }
            }
            catch(Exception e){
                validInput = false;
                Context context = getApplicationContext();
                CharSequence text = "Invalid Midterm Score";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            try {
                finalScore = Integer.parseInt(finalGrade.getText().toString());
                if(finalScore > 200){
                    throw new Exception();
                }
            }
            catch(Exception e){
                validInput = false;
                Context context = getApplicationContext();
                CharSequence text = "Invalid Final Score";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            if(validInput){
                GradeCalculator grade = new GradeCalculator(assignmentsScore, midtermScore, finalScore);
                TextView studentGrade = (TextView)findViewById(R.id.grade);
                char gradeCalculation = grade.calculateGrade();
                studentGrade.setText(gradeCalculation);
            }
        }
    }
}
