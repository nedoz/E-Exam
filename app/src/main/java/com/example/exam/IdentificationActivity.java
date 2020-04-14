package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class IdentificationActivity extends AppCompatActivity {
    CircleImageView img_student,img_professor;
    TextView txt_student,txt_professor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);
        img_student=findViewById(R.id.img_student);
        img_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IdentificationActivity.this,Student_RegistrationActivity.class));
            }
        });
        img_professor=findViewById(R.id.img_professor);
        img_professor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IdentificationActivity.this,Professor_RegistrationActivity.class));
            }
        });
        txt_student=findViewById(R.id.txt_student);
        txt_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IdentificationActivity.this,Student_RegistrationActivity.class));

            }
        });
        txt_professor=findViewById(R.id.txt_professor);
        txt_professor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IdentificationActivity.this,Professor_RegistrationActivity.class));

            }
        });
    }
}
