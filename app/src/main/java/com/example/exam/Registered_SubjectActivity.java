package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registered_SubjectActivity extends AppCompatActivity {
    Button test_subject1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered__subject);
        test_subject1=findViewById(R.id.btn1);
        test_subject1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registered_SubjectActivity.this,Question_Of_SubjectActivity.class));
            }
        });
    }
}
