package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Subject_List extends AppCompatActivity {
    Button add_exam,add_question,edit_question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject__list);
        add_exam=findViewById(R.id.btn_add_exam);
        add_exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Subject_List.this,Add_Exam.class));
            }
        });
        add_question=findViewById(R.id.btn_add_question);
        edit_question=findViewById(R.id.btn_edit_question);
    }
}
