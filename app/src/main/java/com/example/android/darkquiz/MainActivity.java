package com.example.android.darkquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // answers of question
    final int q1Ans = R.id.question_1_2;
    final int q2Ans = R.id.question_2_3;
    final int q3Ans = R.id.question_3_2;
    final int q4Ans = R.id.question_4_4;
    final int q5Ans = R.id.question_5_4;
    final int q6Ans = R.id.question_6_1;
    final int q7Ans = R.id.question_7_2;
    final int q8Ans = R.id.question_8_3;
    final String q9Ans = "nephew";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //verify each answer and update the result
    //display result of player on clicking button
    public void showResult(View view) {
        ArrayList<String> wrongAns = new ArrayList<>();

        int corrAns = 0;

        if (verifyQue1()) {
            corrAns++;
        } else {
            wrongAns.add("Question 1");
        }
        if (verifyQue2()) {
            corrAns++;
        } else {
            wrongAns.add("Question 2");
        }
        if (verifyQue3()) {
            corrAns++;
        } else {
            wrongAns.add("Question 3");
        }
        if (verifyQue4()) {
            corrAns++;
        } else {
            wrongAns.add("Question 4");
        }
        if (verifyQue5()) {
            corrAns++;
        } else {
            wrongAns.add("Question 5");
        }
        if (verifyQue6()) {
            corrAns++;
        } else {
            wrongAns.add("Question 6");
        }
        if (verifyQue7()) {
            corrAns++;
        } else {
            wrongAns.add("Question 7");
        }
        if (verifyQue8()) {
            corrAns++;
        } else {
            wrongAns.add("Question 8");
        }
        if (verifyQue9()) {
            corrAns++;
        } else {
            wrongAns.add("Question 9");
        }
        if (verifyQue10()) {
            corrAns++;
        } else {
            wrongAns.add("Question 10");
        }
        StringBuilder str_build = new StringBuilder();
        for (String str : wrongAns) {
            str_build.append(str);
            str_build.append("\n");
        }
        //shows toast for score.
        Toast toast = Toast.makeText(getApplicationContext(), "Your score is below!", Toast.LENGTH_SHORT);
        toast.show();

        TextView resultTextView = findViewById(R.id.result);
        resultTextView.setText("You got " + corrAns + "/10 answers right.\n\nRecheck the following:\n" + str_build.toString());

        TextView answers = findViewById(R.id.answers);
        answers.setText(R.string.answers);

    }

    //verify each question if the user selected right one
    private boolean verifyQue1() {
        RadioGroup rg = findViewById(R.id.question_1_rg);

        return rg.getCheckedRadioButtonId() == q1Ans;
    }

    private boolean verifyQue2() {
        RadioGroup rg = findViewById(R.id.question_2_rg);

        return rg.getCheckedRadioButtonId() == q2Ans;
    }

    private boolean verifyQue3() {
        RadioGroup rg = findViewById(R.id.question_3_rg);

        return rg.getCheckedRadioButtonId() == q3Ans;
    }

    private boolean verifyQue4() {
        RadioGroup rg = findViewById(R.id.question_4_rg);

        return rg.getCheckedRadioButtonId() == q4Ans;
    }

    private boolean verifyQue5() {
        RadioGroup rg = findViewById(R.id.question_5_rg);

        return rg.getCheckedRadioButtonId() == q5Ans;
    }

    private boolean verifyQue6() {
        RadioGroup rg = findViewById(R.id.question_6_rg);

        return rg.getCheckedRadioButtonId() == q6Ans;
    }

    private boolean verifyQue7() {
        RadioGroup rg = findViewById(R.id.question_7_rg);

        return rg.getCheckedRadioButtonId() == q7Ans;
    }

    private boolean verifyQue8() {
        RadioGroup rg = findViewById(R.id.question_8_rg);

        return rg.getCheckedRadioButtonId() == q8Ans;
    }

    private boolean verifyQue9() {
        EditText et = findViewById(R.id.question_9_et);

        return et.getText().toString().trim().equalsIgnoreCase(q9Ans);
    }

    private boolean verifyQue10() {
        CheckBox c1 = findViewById(R.id.qus_10_cb_1);
        CheckBox c2 = findViewById(R.id.qus_10_cb_2);
        CheckBox c3 = findViewById(R.id.qus_10_cb_3);
        CheckBox c4 = findViewById(R.id.qus_10_cb_4);

        if ((c1.isChecked() && c2.isChecked() && c3.isChecked()) && !(c4.isChecked())) {
            return true;
        }

        return false;
    }

}