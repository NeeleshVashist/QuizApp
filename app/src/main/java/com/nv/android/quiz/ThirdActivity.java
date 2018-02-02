package com.nv.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class ThirdActivity extends AppCompatActivity {

    private int correct = 0, incorrect = 0, score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    /**
     * this method is called for answer 1 calculations.
     */
    public void answer1(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q1a1:
                if (checked) {
                    correct += 1;
                    score += 10;
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.q1a2:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.q1a3:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.q1a4:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        ((RadioButton) view).setChecked(false);
        findViewById(R.id.q1a1).setEnabled(false);
        findViewById(R.id.q1a2).setEnabled(false);
        findViewById(R.id.q1a3).setEnabled(false);
        findViewById(R.id.q1a4).setEnabled(false);
    }


    /**
     * this method is called for answer 2 calculations.
     */
    public void answer2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q2a1:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.q2a2:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.q2a3:
                if (checked) {
                    correct += 1;
                    score += 10;
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.q2a4:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        ((RadioButton) view).setChecked(false);
        findViewById(R.id.q2a1).setEnabled(false);
        findViewById(R.id.q2a2).setEnabled(false);
        findViewById(R.id.q2a3).setEnabled(false);
        findViewById(R.id.q2a4).setEnabled(false);
    }

    /**
     * this method is called for answer 3 calculations.
     */
    public void answer3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q3a1:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.q3a2:
                if (checked) {
                    correct += 1;
                    score += 10;
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.q3a3:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.q3a4:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        ((RadioButton) view).setChecked(false);
        findViewById(R.id.q3a1).setEnabled(false);
        findViewById(R.id.q3a2).setEnabled(false);
        findViewById(R.id.q3a3).setEnabled(false);
        findViewById(R.id.q3a4).setEnabled(false);
    }

    /**
     * this method is called for answer 4 calculations.
     */
    public void answer4(View view) {
        CheckBox check1 = findViewById(R.id.q4a1);
        CheckBox check2 = findViewById(R.id.q4a2);
        CheckBox check3 = findViewById(R.id.q4a3);
        CheckBox check4 = findViewById(R.id.q4a4);
        if (check1.isChecked() && check3.isChecked() && !check2.isChecked() && !check4.isChecked()) {
            correct += 1;
            score += 10;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            incorrect += 1;
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        check1.setChecked(false);
        check2.setChecked(false);
        check3.setChecked(false);
        check4.setChecked(false);
        findViewById(R.id.q4a1).setEnabled(false);
        findViewById(R.id.q4a2).setEnabled(false);
        findViewById(R.id.q4a3).setEnabled(false);
        findViewById(R.id.q4a4).setEnabled(false);
        findViewById(R.id.done4).setEnabled(false);
    }

    /**
     * this method is called for answer 5 calculations.
     */
    public void answer5(View view) {
        CheckBox check1 = findViewById(R.id.q5a1);
        CheckBox check2 = findViewById(R.id.q5a2);
        CheckBox check3 = findViewById(R.id.q5a3);
        CheckBox check4 = findViewById(R.id.q5a4);
        if (check2.isChecked() && !check4.isChecked() && check1.isChecked() && !check3.isChecked()) {
            correct += 1;
            score += 10;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            incorrect += 1;
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        check1.setChecked(false);
        check2.setChecked(false);
        check3.setChecked(false);
        check4.setChecked(false);
        findViewById(R.id.q5a1).setEnabled(false);
        findViewById(R.id.q5a2).setEnabled(false);
        findViewById(R.id.q5a3).setEnabled(false);
        findViewById(R.id.q5a4).setEnabled(false);
        findViewById(R.id.done5).setEnabled(false);
    }

    /**
     * this method called for answer 6 calculations.
     */

    public void answer6(View v) {
        EditText ans6 = findViewById(R.id.aq6);
        String ans61 = ans6.getText().toString();
        if (Objects.equals(ans61, "22")) {
            correct += 1;
            score += 10;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            incorrect += 1;
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        ans6.getText().clear();
        findViewById(R.id.aq6).setEnabled(false);
        findViewById(R.id.done6).setEnabled(false);
    }

    /**
     * this method called for answer 7 calculations.
     */

    public void answer7(View v) {
        EditText ans6 = findViewById(R.id.aq7);
        String ans61 = ans6.getText().toString();
        if (Objects.equals(ans61, "2016")) {
            correct += 1;
            score += 10;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            incorrect += 1;
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        ans6.getText().clear();
        findViewById(R.id.aq7).setEnabled(false);
        findViewById(R.id.done7).setEnabled(false);
    }

    /**
     * this method is called when submit button is clicked.
     */
    public void submitScore(View view) {
        Toast.makeText(getApplicationContext(), "Correct Answers : " + correct + "\nIncorrect Answers : " + incorrect + "\nTotal score : " + score, Toast.LENGTH_SHORT).show();
        String message = ("Correct Answers : " + correct + "\nIncorrect Answers : " + incorrect + "\nTotal score : " + score);
        displayScore(message);
    }

    /**
     * this method is to display result.
     *
     * @param score is the final string.
     */
    public void displayScore(String score) {
        TextView scoreDisplay = findViewById(R.id.result);
        scoreDisplay.setText(score);
    }

    /**
     * this method is called when reset button is pressed.
     */
    public void resetScore(View v) {
        score = 0;
        correct = 0;
        incorrect = 0;
        String message = ("Correct Answers : " + correct + "\nIncorrect Answers : " + incorrect + "\nTotal score : " + score);
        displayScore(message);

        findViewById(R.id.q1a1).setEnabled(true);
        findViewById(R.id.q1a2).setEnabled(true);
        findViewById(R.id.q1a3).setEnabled(true);
        findViewById(R.id.q1a4).setEnabled(true);
        findViewById(R.id.q2a1).setEnabled(true);
        findViewById(R.id.q2a2).setEnabled(true);
        findViewById(R.id.q2a3).setEnabled(true);
        findViewById(R.id.q2a4).setEnabled(true);
        findViewById(R.id.q3a1).setEnabled(true);
        findViewById(R.id.q3a2).setEnabled(true);
        findViewById(R.id.q3a3).setEnabled(true);
        findViewById(R.id.q3a4).setEnabled(true);
        findViewById(R.id.q4a1).setEnabled(true);
        findViewById(R.id.q4a2).setEnabled(true);
        findViewById(R.id.q4a3).setEnabled(true);
        findViewById(R.id.q4a4).setEnabled(true);
        findViewById(R.id.q5a1).setEnabled(true);
        findViewById(R.id.q5a2).setEnabled(true);
        findViewById(R.id.q5a3).setEnabled(true);
        findViewById(R.id.q5a4).setEnabled(true);
        findViewById(R.id.aq6).setEnabled(true);
        findViewById(R.id.aq7).setEnabled(true);
        findViewById(R.id.done4).setEnabled(true);
        findViewById(R.id.done5).setEnabled(true);
        findViewById(R.id.done6).setEnabled(true);
        findViewById(R.id.done7).setEnabled(true);
    }

}
