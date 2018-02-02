package com.nv.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void buttonNext(View v) {
        if (v.getId() == R.id.next) {
            Intent i = new Intent(HomeActivity.this, ThirdActivity.class);
            startActivity(i);
        }
    }
}
