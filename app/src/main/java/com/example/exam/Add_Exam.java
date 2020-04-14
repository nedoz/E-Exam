package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

public class Add_Exam extends AppCompatActivity {
   Button btn_add_exam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__exam);
        btn_add_exam=findViewById(R.id.btn_add_exam);
        btn_add_exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StyleableToast.makeText(Add_Exam.this, "Exam Added Successfuly!", R.style.exampleToast).show();
                startActivity(new Intent(Add_Exam.this,Question_Of_SubjectActivity.class));
            }
        });
    }
}
