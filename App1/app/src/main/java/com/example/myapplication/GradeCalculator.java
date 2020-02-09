package com.example.myapplication;

public class GradeCalculator {
    private int assignments;
    private int midterm;
    private int finalScore;

    public GradeCalculator(int assignments, int midterm, int finalScore){
        this.assignments = assignments;
        this.midterm = midterm;
        this.finalScore = finalScore;
    }

    public int finalScore(){
        return 60 * assignments / 200 + 20 * midterm / 100 + 20 * finalScore / 100;
    }

    public String calculateGrade(int grade){
        if(grade >= 90){
            return "A";
        }
        else if(grade >= 80){
            return "B";
        }
        else if(grade >= 70){
            return "C";
        }
        else {
            return "D";
        }
    }
}
